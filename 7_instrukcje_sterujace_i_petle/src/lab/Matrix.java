package lab;

public class Matrix {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s", j + i + " ");
            }
            System.out.println();
        }
    }
}