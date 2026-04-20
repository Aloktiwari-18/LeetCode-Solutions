# Write your MySQL query statement below
with filtered as(
    Select Users.id, Users.name , coalesce(sum(Rides.`distance`), 0) as `distance`
    from Users
    left join Rides on Users.id=Rides.user_id
    group by Users.id, Users.name

),

valid as(
    Select id  ,name , `distance`,
    dense_rank() over (order by `distance` desc) as rnk
    from filtered
    
)
Select name, distance as travelled_distance 
from valid
ORDER BY distance DESC, name;