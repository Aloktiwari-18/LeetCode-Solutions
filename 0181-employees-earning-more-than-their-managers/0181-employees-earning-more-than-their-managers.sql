# Write your MySQL query statement below
with emp_manager as (
    Select 
    E.name,
    E.salary,
    M.salary as manager_salary

    from Employee E
    join Employee M
    on E.managerId=M.id


)
Select name as Employee
from emp_manager
where salary > manager_salary