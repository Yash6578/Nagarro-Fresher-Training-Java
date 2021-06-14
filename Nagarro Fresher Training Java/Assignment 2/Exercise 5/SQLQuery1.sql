--Write a Procedure supplying name information from the Person.Person table and accepting a filter for 
--the first name. Alter the above Store Procedure to supply Default Values if user does not enter any value.

DROP PROCEDURE dbo.uspGetName
USE AdventureWorks2008R2
GO
CREATE PROCEDURE dbo.uspGetName @FNAME nvarchar(50)
AS
	IF @FNAME IS NULL
	BEGIN
		SET @FNAME = 'DEFAULT'
	END
SELECT *
FROM Person.Person
WHERE FirstName = @FNAME
GO

EXEC dbo.uspGetName ''