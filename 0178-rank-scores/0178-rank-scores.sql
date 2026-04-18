# Write your MySQL query statement below
with ranked as (
    Select score,
    DENSE_RANK() over (order by score DESC) as rnk
    from Scores
)
Select score , rnk as `rank`
from ranked;