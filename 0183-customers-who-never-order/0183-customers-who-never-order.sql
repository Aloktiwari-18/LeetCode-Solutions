# Write your MySQL query statement below
with never_order as (
    Select 
   
    Customers.name 
    from Customers
    left join Orders
    on Customers.id =Orders.customerId
    Where Orders.customerId is null
)
Select name as Customers 
from never_order