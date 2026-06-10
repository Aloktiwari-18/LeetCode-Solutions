# Write your MySQL query statement below
with filterd as (
    Select Activity.player_id , Activity.event_date, min(Activity.event_date) as first_date
    from Activity 
    group by Activity.player_id
)

Select round(coalesce(Sum(case when datediff(Activity.event_date, filterd.first_date)=1 then 1 End)/
count(distinct Activity.player_id),0),2) as fraction 
from Activity

join filterd on Activity.player_id = filterd.player_id