# Write your MySQL query statement below
with filtered as (
    Select max(salary) as max_salary from Employee
)
Select max(salary)  as SecondHighestSalary from Employee
where salary < (Select max_salary from filtered  )
