# Write your MySQL query statement below
with filterd as (
    Select * ,
    row_number() over (order by id) as rn
    from stadium 
    where people >=100

),

 grouped as (
    Select *,
    id-rn as grp
    from filterd
),

valid_grp as (
   Select grp
   from grouped 
   group by grp
   having count(*)>=3

)
Select id , visit_date, people 
from grouped
where grp in (Select grp from valid_grp)
order by visit_date
