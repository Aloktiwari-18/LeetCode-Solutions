# Write your MySQL query statement below
with ranked as (
    Select Department.name as Department ,
    Employee.name as Employee,
    Employee.salary as salary,

    DENSE_RANK() over (  PARTITION BY Employee.departmentId order by salary desc)as rnk
    from Employee 
    join Department on Employee.departmentId=  Department.id
)
Select Department , Employee, salary from ranked
where rnk=1

