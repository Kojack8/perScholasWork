-- 1.
SELECT customerName AS 'Customer Name', CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep'
  FROM customers c
  JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
  ORDER by customerName;

-- 2.
SELECT productName AS 'Product Name', o.quantityOrdered AS 'Total # Ordered', o.quantityOrdered * o.priceEach AS 'Total Sale'
  FROM products p
  JOIN orderdetails o ON p.productCode = o.productCode
  ORDER BY o.quantityOrdered * o.priceEach DESC;

-- 3.
SELECT status AS 'Order Status', COUNT(status)
  FROM orders o
  GROUP BY status
  ORDER BY status;

-- 4.
SELECT productLine as 'Product Line', SUM(o.quantityOrdered) AS '# Sold'
  FROM products p
  JOIN orderdetails o ON p.productcode = o.productcode
  GROUP BY productLine
  ORDER BY SUM(o.quantityOrdered) desc;
  
-- 5.
SELECT 
    CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep', count(quantityOrdered) AS '# Orders', SUM(od.quantityOrdered * od.priceEach) AS 'Total Sales'
    FROM orderdetails od
    JOIN orders o ON o.orderNumber = od.orderNumber
    JOIN customers c ON c.customerNumber = o.customerNumber
    JOIN employees e ON e.employeeNumber = c.salesRepEmployeeNumber
    GROUP BY e.lastName;

-- 6.
SELECT MONTHNAME(paymentDate) AS 'Month', YEAR(paymentDate) AS 'Year', FORMAT(SUM(amount), 2) AS 'Payments Recieved'
  FROM payments
  GROUP BY month(paymentDate), year(paymentDate)
  ORDER BY year(paymentDate), month(paymentDate)