# Write your MySQL query statement below
with ranked as (
    Select Department.name as Department , Employee.name as Employee , Employee.salary as Salary,

    dense_rank()over ( partition by Employee.departmentId order by Employee.salary desc) as rnk
    from Employee
    join Department on  Department.id = Employee.departmentId
)


Select Department , Employee , Salary
from ranked 

where rnk =1
