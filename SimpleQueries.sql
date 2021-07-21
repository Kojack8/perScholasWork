1.  SELECT productName AS 'Name', productLine AS 'Product Line', buyPrice AS 'Buy Price'
      FROM products
      ORDER BY buyPrice DESC;

2.  SELECT contactFirstName AS 'First Name', contactLastName AS 'Last Name', city AS 'City'
      FROM customers
      WHERE country='Germany'
      ORDER BY contactLastName;

3.  SELECT DISTINCT status
      FROM orders
      ORDER BY status;

4.  SELECT *
        FROM payments
        WHERE paymentDate >= '2005-01-01'
        ORDER BY paymentDate asc;

5.  SELECT lastName, firstName, email, jobTitle
      FROM employees
      WHERE officeCode = 1
      ORDER BY lastName;

6.  SELECT productName, productLine, productScale, productVendor
      FROM products
      WHERE productLine = 'Vintage Cars' OR productLine = 'Classic Cars'
      ORDER BY productLine desc, productName;