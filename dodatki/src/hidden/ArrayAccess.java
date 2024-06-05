package hidden;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj indeks: ");
            int index = Integer.parseInt(scanner.nextLine());

            System.out.println("Wartość: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks poza zakresem!");
        } catch (NumberFormatException e) {
            System.out.println("Wprowadź poprawny indeks!");
        } finally {
            scanner.close();
        }
    }
}
