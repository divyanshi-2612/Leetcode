# Write your MySQL query statement below
SELECT contest_id , ROUND(COUNT(distinct user_id)*100/(select COUNT(user_id)from Users),2) as percentage
FROM Register
group by contest_id
order by percentage desc, contest_id;
