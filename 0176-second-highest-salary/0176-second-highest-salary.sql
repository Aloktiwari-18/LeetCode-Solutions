WITH filtered AS (
    SELECT MAX(salary) AS max_salary
    FROM Employee
)

Select max(salary)  as SecondHighestSalary  from Employee 
where salary < (Select max_salary from filtered)
limit 1
