package hidden;

public class NumberSystemOperation {

    public static void main(String[] args) {

        int a = 10; //dziesiętnie
        int b = 010; //ósemkowo
        int c = 0x10; //szestnastkowo

        int d = a + b -c;

        System.out.println(a + " + " + b + " - " + c + " = " + d);

        System.out.println(d + " -> "+ Integer.toBinaryString(d));
    }
}
