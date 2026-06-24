# Write your MySQL query statement below
with first_order as(Select delivery_id , customer_id , min(order_date) as order_date , min(customer_pref_delivery_date) as cust_d from Delivery

group by customer_id
)

Select round( count( case when order_date=cust_d then 1 else null end)/count(customer_id)*100,2) as immediate_percentage

from first_order





-- Select count() as immediate_percentage
-- from Delivery
-- where datediff(order_date, customer_pref_delivery_date)=0
-- group by customer_id