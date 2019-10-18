package lab;

public class BitPosition {
    public static void main(String[] args) {
        int i = 123;
        int n = 2;
        int mask = 1 << n;
        boolean result = (i & mask) > 0;

        System.out.println("Dla liczby " + i +" na " + n + " pozycji znajduje się bit " + result);

        System.out.println();
        System.out.println();

        System.out.println(String.format("%32s",Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("-----------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(i & mask)).replace(' ', '0'));
    }
}
