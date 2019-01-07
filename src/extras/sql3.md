# SQL Lab 3

## Funkcje agregujące ##
1. Liczba wierszy w tabeli Sales.SalesOrderHeader
2. Suma wartości w kolumnie TotalDue dla wszystkich zamówień złożonych w 2001
3. Suma wartości w kolumnie TotalDue dla wszystkich zamówień złożonych w 2001 przez klienta 442

## GROUP BY ## 
4. Suma wartości w kolumnie TotalDue dla wszystkich zamówień, zgrupowane wg roku.
Wyświetl 2 kolumny: RokZamowienia (posortuj rosnąco) | SumaOplat
5. Suma wartości w kolumnie TotalDue dla zamówień złożonych w 2002, pogrupowane wg klientów
Wyświetl 2 kolumny: KlientID (posortuj rosnąco) | SumaOplat
6. Zmodyfikuj zapytanie 5:
…zamówienia złożone pomiędzy 1 maja 2003, a 6 maja 2003

## HAVING ## 
7. Zmodyfikuj zapytanie 6:
... dla których SumaOplat jest większa niż 40 000, posortuj wg SumaOplat Sales.SalesOrderHeader
