/*
	Query to Display the [SalesPersonID] with an additional column entitled 
	‘Commission Band’ indicating the appropriate band 
*/
SELECT BusinessEntityID
	,	CommissionPct
	--,	100 * CommissionPct as 'Percent'
	,	CASE WHEN (CommissionPct * 100) > 1.50
		THEN 'BAND 3'
		WHEN (CommissionPct * 100) > 1
		THEN 'BAND 2'
		WHEN (CommissionPct * 100) > 0
		THEN 'BAND 1'
		ELSE 'BAND 0'
		END AS 'Commission Band'
FROM Sales.SalesPerson
ORDER BY CommissionPct

