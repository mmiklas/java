# SQL laboratorium 1

1. Wyświetl:
- wszystkie wiersze (wszystkie kolumny) tabeli [SalesOrderHeader]
- 3 wybrane kolumny tabeli [SalesOrderHeader] posortowanie wg kolumny ModifiedDate malejąco
- 3 kolumny tabeli [Person].[Contact], posortowane wg LastName malejąco i FirstName rosnąco
- wszystkie wiersze z tabeli Person.Contact zawierające 'Michael' w kolumnie FirstName, posortowane wg kolumny Lastname
- wszystkie dane kontaktowe (tabela Person.Contact) osób o innym imieniu niż 'Michael' i nazwisku zaczynającym się na Ac (zapytanie zwróci 4 wiersze)
- wszystkie dane kontaktowe zmodyfikowane między 1, a 22 września 2003 (928 wierszy)
- 10 ostatnio zatrudnionych pracowników
- 10 najstarszych pracowników płci żeńskiej
- pracowników, których stanowisko (kolumna Title) zaczyna się na 'Production Technician', lub 'Tool Designer', posortowani wg nazwy stanowiska
- nazwy stanowisk bez duplikatów (67 wierszy)
- 3 kolumny z tabeli Person.Contact, korzystając z aliasów, przetłumacz nazwy kolumn w wyniku na język polski: FirstName=Imie, LastName=Nazwisko, Phone=Telefon