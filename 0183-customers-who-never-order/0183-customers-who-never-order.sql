# Write your MySQL query statement below

with filterd as (
Select name from Customers
left join Orders on Customers.id=Orders.customerId
 Where Orders.customerId is null
)

Select name as Customers
from filterd 



