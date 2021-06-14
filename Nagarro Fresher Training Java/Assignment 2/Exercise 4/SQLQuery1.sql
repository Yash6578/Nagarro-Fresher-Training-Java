USE AdventureWorks2008R2
GO

CREATE FUNCTION SalesOrder(@SalesOrderID int,@CurrencyCode nvarchar(3), @Date date )
RETURNS TABLE 
AS
RETURN
WITH  MyProductTable 
AS
(
	SELECT*
	FROM Sales.SalesOrderDetail sod
	WHERE sod.SalesOrderID = @SalesOrderID
)
SELECT mpt.OrderQty, mpt.ProductID ,mpt.UnitPrice,mpt.UnitPrice*cr.EndOfDayRate as 'Converted Currency Price'
FROM MyProductTable mpt,Sales.CurrencyRate cr
WHERE cr.ToCurrencyCode = @CurrencyCode AND cr.CurrencyRateDate = @Date
GO

--To Perform query select only below query and execute it because above function is already added in the database--
SELECT *
FROM SalesOrder(43689,'BRL','2005-07-08')