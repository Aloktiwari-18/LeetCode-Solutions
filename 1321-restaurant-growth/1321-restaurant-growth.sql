# Write your MySQL query statement below
WITH temp AS(
SELECT visited_on,
SUM(amount) amount
FROM Customer
GROUP BY visited_on)

SELECT visited_on,
SUM(amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING) amount,
ROUND(AVG(amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING),2) average_amount
FROM temp
ORDER BY visited_on
limit 100 offset 6