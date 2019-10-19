import java.awt.*;

public class Demo8 {

    public static void main(String[] args) {

        //deklaracje
        String[] requests;
        Point[] points;
        float[] donations;

        String targets[];

        //odwoływanie do tablicy
        int[] temps = new int[99];

        Integer[] series = new Integer[3];
        series[0] = new Integer(10);
        series[1] = new Integer(3);
        series[2] = new Integer(5);

        float[] rating = new float[20];
        //rating[20] = 3.22F; //błąd nie ma takiego elementu
        System.out.println("Elementy: " + rating.length);

        //inicjalizator jako krótszy sposób definiowania tablic
        //utworzenie 5. elementowej tablicy
        int[] n = {10, 20, 30, 40, 50};
        //utworzenie 3. elemnowej tablicy z literami
        char[] letters = {'a','b','c'};



        //tablice z elementami typu referencyjnego
        Point[] markup = { new Point(1,5), new Point(3,3), new Point(2,3)};
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point p = new Point(1,1);

        Point[] array = new Point[3];
        array[0] = p;
        array[1] = array[0];
        array[2] = array[1];

        array[0].y = 50;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //tablice wielowymiarowe
        int [][][] multiDimArr = {{{1}},{{2},{3}}};

        //iterowanie po tablicach
        int[] arr = {1, 2, 3, 6, 12};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //dwuwymiarowa tablica łańcuchów znaków
        String[] dogs = {"Burek", "Pluto", "Łajka"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[][] names = {dogs, people};

        //iterowanie po tablicy dwuwymiarowej
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
