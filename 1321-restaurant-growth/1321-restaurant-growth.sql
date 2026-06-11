# Write your MySQL query statement below
with temp as(
    Select visited_on,
    sum(amount) amount
    from Customer
    group by visited_on

)
Select visited_on,
sum(amount) over (order by visited_on rows 6 PRECEDING) amount,
Round(AVg(amount) over (order by visited_on rows 6 PRECEDING),2) average_amount

from temp
order by visited_on
limit 100 offset 6
