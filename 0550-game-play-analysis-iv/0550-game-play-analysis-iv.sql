# Write your MySQL query statement below
with filtered as (
    Select Activity.player_id ,Activity.event_date , min(Activity.event_date) as first_date
    from Activity
    group by player_id 
)

Select Round(coalesce(Sum(case when datediff(Activity.event_date,filtered.first_date)=1 then 1  End )/
count(distinct Activity.player_id),0), 2) as fraction
from Activity

join filtered
on Activity.player_id=filtered.player_id