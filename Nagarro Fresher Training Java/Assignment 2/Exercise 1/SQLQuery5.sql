-- Query to Display Description and MaxQty fields from the SpecialOffer table
-- if MaxQty is null then replace value with 0
SELECT Description
	,	ISNULL(MaxQty,0.00) AS 'MaxQty'
FROM Sales.SpecialOffer