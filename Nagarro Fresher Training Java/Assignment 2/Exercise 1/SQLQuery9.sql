DECLARE @ID int;
SET @ID = (
			SELECT BusinessEntityID
			FROM Person.Person
			WHERE FirstName = 'Ruth' 
			and	LastName = 'Ellerbrock' 
			and	PersonType = 'EM')	

EXEC dbo.uspGetEmployeeManagers @ID