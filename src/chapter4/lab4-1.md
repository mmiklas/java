# Lab 4.1

1. Zmodyfikuj projekt MarsRobot z rozdziału 2, w taki sposób, aby korzystał z konstruktorów.

2. Utwórz klasę dla czterowymiarowego punktu o nazwie FourDPoint, który dzidziczy po klasie Point z pakietu java.awt.

3. Zaprojektuj hierarchię klas tak, aby:
* klasa C dziedziczy po klasie B, a klasa B dziedziczy po klasie A
* instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
* instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
* instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu "pierwszego" konstruktora (kosntruktory klas bazowych milczą)