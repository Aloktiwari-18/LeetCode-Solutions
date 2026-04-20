# Write your MySQL query statement below
Select id ,
case when id%2=1 then
COALESCE(Lead(Student) over (order by id), student)
when id%2=0 then
Lag(Student) over(order by id)
end as Student
from seat