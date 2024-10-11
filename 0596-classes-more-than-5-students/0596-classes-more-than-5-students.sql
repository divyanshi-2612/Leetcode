# Write your MySQL query statement below
SELECT class 
FROM COURSES 
GROUP BY class having COUNT(CLASS)>=5;