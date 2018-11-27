package results;

public class ArrayFiller {
    public static void main(String[] args) {
        int arrSize = 0;
        if (args.length > 0) {
            arrSize = Integer.parseInt(args[0]);
        } else {
            System.out.println("Nie podano argumentów programu");
            System.exit(-1);
        }

        int[] arr = new int[arrSize];

        fill(arr);
        show(arr);
        revers(arr);
        show(arr);
    }

    static void show(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            //nie wyswietlamy przecinka po ostatnim elemencie
            if (i != (arr.length - 1)) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    static void revers(int[] arr) {
        //definicja tablicy tymczasowej
        int[] tmp = new int[arr.length];

        //kopiowanie tablicy
        for (int i = 0; i < arr.length ; i++) {
            tmp[i] = arr[i];
        }

        //odwracanie tablicy
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = tmp[arr.length - 1 - i];
        }
    }
}
