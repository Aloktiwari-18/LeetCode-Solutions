# Write your MySQL query statement below
Select v.customer_id , count(v.visit_id ) as count_no_trans
from Visits v left join Transactions on v.visit_id=Transactions.visit_id
where Transactions.transaction_id  is null
group by v.customer_id