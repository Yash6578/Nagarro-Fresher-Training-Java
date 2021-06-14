-- Query to Display Name and Color of the Product with the maximum weight. 
SELECT Name
	,	Color
	,	Weight AS MaxWeight
FROM Production.Product
WHERE Weight = (SELECT MAX(Weight) FROM Production.Product)