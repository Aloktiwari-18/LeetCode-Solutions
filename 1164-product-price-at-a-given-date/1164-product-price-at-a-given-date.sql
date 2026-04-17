# Write your MySQL query statement below
with B as(
SELECT *, MIN(IF(datediffs < 0 ,null,datediffs)) over(partition by product_id ) as min_date
from (SELECT *, DATEDIFF('2019-08-16',change_date) as datediffs
FROM Products) as A
)
SELECT distinct product_id , If(min_date is null,10 ,new_price) as price
FROM B
WHERE datediffs = min_date or min_date is null