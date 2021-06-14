--10. Display the ProductId of the product with the largest stock level. Hint: Use the Scalar-valued function [dbo].
--[UfnGetStock]. (Schema(s) involved: Production)

SELECT MAX(dbo.ufnGetStock(ProductID)) AS LargestStockProductID
FROM Production.Product

SELECT TOP 1 ProductID
FROM Production.ProductInventory
GROUP BY ProductID
Order BY SUM(Quantity) DESC