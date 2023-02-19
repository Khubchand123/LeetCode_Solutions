# Write your MySQL query statement below
select name as customers from customers where customers.id Not in (select customerid from orders);