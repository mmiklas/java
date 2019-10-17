package lab;

public class Triangle {

    public static void main(String[] args) {
        char copyright = 169; //liczba 169 reprezentuje znak '©' w tablicy ASCII
        String space =" ";

        String row1 = space + space + space+ copyright;
        String row2 = space + space+ copyright + space + copyright;
        String row3 = space + copyright + space + space + space + copyright;
        String row4 = "" + copyright + space + copyright + space + copyright + space + copyright;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
    }
}
