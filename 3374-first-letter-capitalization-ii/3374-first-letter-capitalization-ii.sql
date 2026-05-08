WITH RECURSIVE cte1 AS (
   SELECT content_id,
          content_text AS text,
          LENGTH(content_text) AS len 
   FROM user_content
),

cte2 AS (
    SELECT content_id,1 AS idx,text,len,
           SUBSTRING(text,1,1) AS charr 
    FROM cte1
    
    UNION ALL
    
    SELECT content_id,idx+1,text,len,
           SUBSTRING(text,idx+1,1) AS charr
    FROM cte2
    WHERE idx+1 <= len
),

cte3 AS (
    SELECT content_id,idx,text,len,charr,
           LAG(charr,1,' ') OVER(PARTITION BY content_id ORDER BY idx) AS prv,
           LEAD(charr,1,' ') OVER(PARTITION BY content_id ORDER BY idx) AS nxt,
           SUM(CASE WHEN charr=' ' THEN 1 ELSE 0 END)
           OVER(PARTITION BY content_id ORDER BY idx) AS token_id
    FROM cte2
),

cte4 AS (
    SELECT content_id,idx,text,len,charr,prv,nxt,token_id,
    
           -- detect consecutive dashes ("--")
           SUM(CASE WHEN charr='-' AND prv='-' THEN 1 ELSE 0 END)
           OVER(PARTITION BY content_id,token_id) AS double_dash,
    
           -- detect invalid characters
           SUM(CASE 
               WHEN charr NOT REGEXP '^[A-Za-z0-9 \\-]$'
               THEN 1 ELSE 0 
           END) OVER(PARTITION BY content_id,token_id) AS invalid_count,
    
           -- detect boundary dashes
           SUM(CASE 
               WHEN charr='-' AND (prv=' ' OR nxt=' ') 
               THEN 1 ELSE 0 
           END) OVER(PARTITION BY content_id,token_id) AS bndry_dash
    
    FROM cte3
),

cte5 AS (
    SELECT content_id,idx,text,len,charr,
    
           CASE
               WHEN prv=' ' THEN UPPER(charr)
               WHEN prv='-' AND double_dash=0 AND invalid_count=0 AND bndry_dash=0
                    THEN UPPER(charr)
               ELSE LOWER(charr)
           END AS final_char
    
    FROM cte4
)

SELECT content_id,
       text AS original_text,
       GROUP_CONCAT(final_char ORDER BY idx ASC SEPARATOR '') AS converted_text
FROM cte5
GROUP BY content_id, text;