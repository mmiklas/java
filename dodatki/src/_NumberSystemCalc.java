public class _NumberSystemCalc {
    public static void main(String[] args) {
        int a = 13;
        int b = 2;
        int result = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + result);

        System.out.println();

        System.out.println("binarnie");
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("----------");
        System.out.println(String.format("%8s",Integer.toBinaryString(result)).replace(' ', '0'));

        System.out.println();

        System.out.println("ósemkowo");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("----------");
        System.out.println(Integer.toOctalString(result));

        System.out.println();

        System.out.println("szesnastkowo");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("----------");
        System.out.println(Integer.toHexString(result));
    }
}
