/*Query to Display list of FirstName and LastName for employees where Title is one
  of Design Engineer, Tool Designer or Marketing Assistant.*/
SELECT FirstName
	,	LastName
	,	JobTitle
From HumanResources.Employee,Person.Person
WHERE JobTitle IN ('Design Engineer', 'Tool Designer', 'Marketing Assistant')