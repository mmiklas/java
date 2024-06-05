package hidden;

public class MathOperationTester {
    public static void main(String[] args) {
        Operation addition = new Addition();
        Operation multiplication = new Multiplication();

        double addResult = addition.execute(5, 3);
        double multiplyResult = multiplication.execute(5, 3);

        System.out.println("Wynik dodawania: " + addResult);
        System.out.println("Wynik mnożenia: " + multiplyResult);
    }
}
