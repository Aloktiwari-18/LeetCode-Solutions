(
-- 1. Most active user
SELECT U.name AS results
FROM MovieRating MR
JOIN Users U ON MR.user_id = U.user_id
GROUP BY MR.user_id
ORDER BY COUNT(*) DESC, U.name ASC
LIMIT 1
)

UNION ALL

(
-- 2. Highest avg rated movie in Feb 2020
SELECT M.title AS results
FROM MovieRating MR
JOIN Movies M ON MR.movie_id = M.movie_id
WHERE MR.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY MR.movie_id
ORDER BY AVG(MR.rating) DESC, M.title ASC
LIMIT 1
);