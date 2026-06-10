# Write your MySQL query statement below
with filterd as (
    Select E1.id , E1.name  , E2.id as emp_count from Employee E1 
    join Employee E2 on E1.id = E2.managerId
)
-- Select * from filterd
Select  name from filterd
group by name , id
having count(emp_count) >=5
-- Select distinct name from filterd 

