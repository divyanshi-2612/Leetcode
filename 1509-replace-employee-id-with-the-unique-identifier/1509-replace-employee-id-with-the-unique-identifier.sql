# Write your MySQL query statement below
SELECT  eu.unique_id AS unique_id , e.name AS name from Employees AS e LEFT JOIN EmployeeUNI AS eu ON e.id=eu.id;