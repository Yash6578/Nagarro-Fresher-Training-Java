--Write a trigger for the Product table to ensure the list price can never be raised more than 15 Percent in a single change.
--Modify the above trigger to execute its check code only if the ListPrice column is   updated (Use AdventureWorks Database).

USE AdventureWorks2008R2
GO

CREATE TRIGGER CheckPriceList
ON Production.Product
AFTER UPDATE
AS
BEGIN 
		IF UPDATE(ListPrice)
			BEGIN 
				DECLARE @OldPrice FLOAT
				DECLARE @NewPrice FLOAT
				SELECT @NewPrice = ListPrice FROM inserted
				SELECT @OldPrice = ListPrice FROM deleted
				IF (@NewPrice > 0.15*@OldPrice + @OldPrice)
					BEGIN
					PRINT 'List Price can not be raised more than 15% of the Old List Price'
					ROLLBACK TRANSACTION
					END
				ELSE 
					
					PRINT 'List Price is updated successfully...'
			END
END
GO

--first we perform update query to raise the list price--

update Production.Product
set ListPrice = 62
where ProductID = 987

--after update is done successfully check the List Price is updated--
select*
from Production.Product
where ProductID = 987