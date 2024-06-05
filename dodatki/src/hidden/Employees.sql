-- tworzymy tabelę Employees
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY IDENTITY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Age INT NOT NULL
)

-- wstawiamy przykładowe dane
INSERT INTO Employees(FirstName, LastName, Age) VALUES ('Jan', 'Kowalski', 38), ('Adam', 'Nowask', 22), ('Katarzyna', 'Polańska', 29)

-- sprawdzamy, czy dane zostały wstawione
SELECT * FROM Employees
