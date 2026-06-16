# Write your MySQL query statement below
Select machine_id , Round(sum(case when activity_type='start' then - timestamp else timestamp end)/ count(distinct process_id),3) as processing_time
from Activity
group by machine_id