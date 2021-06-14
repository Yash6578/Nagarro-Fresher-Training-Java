-- Query to Display the FirstName and LastNamewhere FirstName contains the letters ‘ss’.
-- and an additional column with sequential numbers for each row returned beginning at 
-- integer 1.
SELECT ROW_NUMBER() OVER (ORDER BY FirstName) AS 'RowNumber'
	,	FirstName
	,	LastName
FROM Person.Person
WHERE FirstName like '%ss%';