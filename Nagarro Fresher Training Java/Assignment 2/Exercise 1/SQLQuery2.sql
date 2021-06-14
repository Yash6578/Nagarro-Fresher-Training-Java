-- Query to Display First and last name which starts from letter 'B'
SELECT FirstName
	,	LastName
FROM Person.Person
WHERE FirstName like 'B%'