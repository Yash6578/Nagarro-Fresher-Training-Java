/*
	Query to list all AdventureWorks customers who have not placed an order.
*/
-- Using "IN" OPERATOR
-- Sub Query
SELECT *
FROM Sales.Customer
WHERE CustomerID NOT IN (SELECT CustomerID 
					FROM Sales.SalesOrderHeader
					)

-- Using  "EXISTS()" FUNCTION
-- Exist function
SELECT *
FROM Sales.Customer AS SC
WHERE NOT EXISTS(SELECT CustomerID 
			FROM Sales.SalesOrderHeader AS SOH 
			WHERE SOH.CustomerID = SC.CustomerID)

-- Using Join
SELECT *
FROM Sales.Customer AS SC
LEFT JOIN Sales.SalesOrderHeader AS SOH
ON SC.CustomerID = SOH.CustomerID
WHERE SOH.SalesOrderID is NULL
ORDER BY SC.CustomerID

-- Using CTE
WITH CTE(OrderID,CustID)
AS
(
	SELECT SalesOrderID,CustomerID
	FROM Sales.SalesOrderHeader 
)
SELECT *
FROM Sales.Customer C
LEFT JOIN CTE 
ON C.CustomerID = CTE.CustID 
WHERE CTE.OrderID is NULL 