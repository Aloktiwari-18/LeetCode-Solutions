# Write your MySQL query statement below
Select DATE_FORMAT(trans_date, "%Y-%m") as month,
country, 
COUNT(*) AS trans_count,
count(case when state="approved" then 1 else null end) as approved_count,
SUM(amount) AS trans_total_amount,
sum(case when state="approved" then amount else 0 end) as approved_total_amount

from Transactions 
GROUP BY DATE_FORMAT(trans_date, '%Y-%m'), country;


