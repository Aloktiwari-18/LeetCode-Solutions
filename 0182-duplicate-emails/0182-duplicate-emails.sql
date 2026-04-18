# Write your MySQL query statement below
with  per_email as  (

    Select  email from Person
    group by email
    having count(*)>1
)
Select distinct email as Email from per_email