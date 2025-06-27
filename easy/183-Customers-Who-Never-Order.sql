# Using NOT IN
SELECT name AS Customers
from Customers 
WHERE id NOT IN (
    SELECT customerId
    FROM Orders 
);

/* USING LEFT JOIN

SELECT name AS Customers
FROM Customers C 
LEFT JOIN Orders O
ON C.id=O.customerId
WHERE O.customerId IS NULL;
*/
