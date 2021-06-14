/*
	Query to Display the overall Average of the [CurrencyRate].[AverageRate] 
	values for the exchange rate ‘USD’ to ‘GBP’ for the year 2005
	Note: The field [CurrencyRate].[AverageRate] is defined as 
	'Average exchange rate for the day.
*/
SELECT AVG(AverageRate) AS 'Average exchange rate for the day'
FROM Sales.CurrencyRate
WHERE FromCurrencyCode = 'USD' and ToCurrencyCode = 'GBP' and YEAR(CurrencyRateDate) = 2005