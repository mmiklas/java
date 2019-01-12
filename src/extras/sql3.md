# SQL Lab 3

1. Liczba wierszy w tabeli Sales.SalesOrderHeader.
2. Suma wartości w kolumnie TotalDue dla wszystkich zamówień złożonych w 2001.
3. Suma wartości w kolumnie TotalDue dla wszystkich zamówień złożonych w 2001 przez klienta 442.
4. Suma wartości w kolumnie TotalDue dla wszystkich zamówień, zgrupowane wg roku.
Wyświetl 2 kolumny: RokZamowienia (posortuj rosnąco) | SumaOplat.
5. Suma wartości w kolumnie TotalDue dla zamówień złożonych w 2002, pogrupowane wg klientów.
Wyświetl 2 kolumny: KlientID (posortuj rosnąco) | SumaOplat.
6. Zmodyfikuj zapytanie 5:
...zamówienia złożone pomiędzy 1 maja 2003, a 6 maja 2003.
7. Zmodyfikuj zapytanie 6:
...dla których SumaOplat jest większa niż 40 000, posortuj wg SumaOplat Sales.SalesOrderHeader.
8. Wyświetl produkty wraz z podkategoriami (wszystkie kolumny).
Połącz tabelę Production.Product z Production.ProductSubcategory.
9. Zmodyfikuj zapytanie 8:
Pokaż tylko kolumny: ProductID, Name, Color z tabeli Production.Product oraz Name (alias
'SubCategoryName') z tabeli Production.ProductSubcategory.
10. Zmodyfikuj zapytanie 9:
Zmień kolejność kolumn: SubCategoryName, ProductID, Name, Color.
Posortowane wg nazwy podkategorii, oraz nazwy produktu rosnąco.
11. Zmodyfikuj zapytanie 10:
Dodaj trzecią tabelę Production.ProductCategory.
Wyświetl w wyniku dodatkowo nazwę kategorii - jako pierwszą kolumnę.
12. Tabele: Sales.Customer, Sales.SalesOrderHeader.
Wyświetl ID klienta oraz ID złożonych przez niego zamówień
Wyznacz liczbę złożonych wierszy.
13. Zmodyfikuj zapytanie 12:
Zamień złączenie INNER JOIN na LEFT OUTER JOIN, żeby wyświetlić wszystkich klientów, a nie tylko tych,
którzy złożyli jakieś zamówienia.
14. Zmodyfikuj zapytanie 13:
Dodaj warunek filtrujący WHERE, aby ograniczyć wynik tylko do klientów, którzy nie złożyli żadnego
zamówienia.
