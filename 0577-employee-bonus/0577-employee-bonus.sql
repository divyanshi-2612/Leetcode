# Write your MySQL query statement below
SELECT e.name, b.bonus 
FROM Employee e
LEFT JOIN Bonus b ON  e.empId = b.empID where b.bonus <1000 or bonus is NULL;