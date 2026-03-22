# Write your MySQL query statement below
SELECT teacher_id, COUNT(*) AS cnt
FROM (
    SELECT DISTINCT teacher_id, subject_id
        FROM Teacher
        ) AS temp
 GROUP BY teacher_id;
