# Write your MySQL query statement below

select MAX(SALARY) AS SecondHighestSalary from Employee where SALARY NOT IN (SELECT MAX(SALARY) FROM EMPLOYEE);