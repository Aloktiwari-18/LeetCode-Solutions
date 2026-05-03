# Write your MySQL query statement below
WITH cts AS(SELECT buyer_id ,item_id
FROM Orders
WHERE order_date BETWEEN'2019-01-01' AND'2019-12-31'

ORDER BY 1 )
SELECT a.user_id as buyer_id ,a.join_date,ifnull(count(b.item_id),0) as orders_in_2019
FROM Users as a
LEFT JOIN cts as b
ON a.user_id=b.buyer_id
GROUP BY 1