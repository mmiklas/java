package results;

public class _Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 67;

        results._Calculator calculator = new results._Calculator();

        System.out.println("Wynik dodawania: " + calculator.sum(a, b));
        System.out.println("Wynik odejmowania: " + calculator.sub(a, b));
        System.out.println("Wynik mnożenia: " + calculator.mult(a, b));


    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
