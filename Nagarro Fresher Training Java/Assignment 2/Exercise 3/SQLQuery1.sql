/*
	Query to display most recent five orders that were purchased from account numbers 
	that have spent more than $70,000 with AdventureWorks.
*/
WITH AC AS
(
	SELECT AccountNumber
		,	OrderDate
		,	TotalDue
		,	rn = ROW_NUMBER()
	OVER (PARTITION BY CustomerID ORDER BY AccountNumber, OrderDate DESC)
	FROM 
	(	
		SELECT *
		FROM Sales.SalesOrderHeader AS SOH
		WHERE SOH.AccountNumber IN (
								SELECT AccountNumber
								FROM Sales.SalesOrderHeader AS SOH
								LEFT JOIN Sales.SalesOrderDetail AS SOD
								ON SOH.SalesOrderID = SOD.SalesOrderID
								GROUP BY AccountNumber
								HAVING SUM(SOD.LineTotal) > 70000
								)
	) AS T
)
SELECT rn AS 'Recent Orders'
	,	AccountNumber
	,	OrderDate
	,	TotalDue
FROM AC
WHERE rn <= 5
ORDER BY AccountNumber, OrderDate DESC
