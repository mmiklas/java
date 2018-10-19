package results;

public class NumberPresenter {
    public static void main(String[] args) {
        showNumber(123);
    }

    public static void showNumber(int i) {
        System.out.println("dziesiętnie: \t" + i);
        System.out.println("------------------------");
        System.out.println("binarnie: \t\t" + Integer.toBinaryString(i));
        System.out.println("ósemkowo: \t\t" + Integer.toOctalString(i));
        System.out.println("szesnastkowo: \t" + Integer.toHexString(i));
    }
}
