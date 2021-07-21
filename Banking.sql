-- 1.
SELECT p.name AS 'Product',  pt.name AS 'Type'
  FROM product p
  JOIN product_type pt on p.product_type_cd=pt.product_type_cd

-- 2.
SELECT b.name, b.city, e.last_name, e.title
  FROM branch b
  JOIN employee e on b.branch_id = e.assigned_branch_id;

-- 3.
SELECT DISTINCT title
  FROM employee;

-- 4.
-- The presidents superior field is null so he drops when these join
SELECT x.last_name, x.title, y.last_name AS 'Sup. Last Name', y.title AS 'Sup. Title'
  FROM employee x
  JOIN employee y ON x.superior_emp_id = y.emp_id;

-- 5.
SELECT p.name, a.avail_balance, i.last_name
  FROM account a
  JOIN product p on a.product_cd = p.product_cd
  JOIN customer c on a.cust_id = c.cust_id
  JOIN individual i on c.cust_id = i.cust_id;

-- 6.
SELECT act.*
  FROM acc_transaction act
  JOIN account ac ON act.account_id = ac.account_id
  JOIN customer c ON ac.cust_id = c.cust_id
  JOIN individual i on c.cust_id = i.cust_id
  WHERE i.last_name LIKE 'T%';