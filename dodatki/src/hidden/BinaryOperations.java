package hidden;

public class BinaryOperations {
    public static void main(String[] args) {

        int a = 0b11001;
        int b = 0b11101;
        int c = 0b00011;
        int result = 0b11010;

        boolean isCorrect = (a & b ^ c) == result;

        System.out.println("Sprawdzam, czy podane działanie jest poprawne: " + isCorrect);
    }
}
