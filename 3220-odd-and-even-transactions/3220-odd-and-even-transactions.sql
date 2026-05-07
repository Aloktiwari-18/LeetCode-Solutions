# Write your MySQL query statement below
with ct as (select transaction_date,
case when amount%2=0 then amount else 0 end as even,
case when amount%2!=0 then amount else 0 end as odd
from transactions )

select
transaction_date,
sum(odd) as odd_sum,
sum(even) as even_sum
from ct
group by transaction_date
order by transaction_date