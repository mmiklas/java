package results;

public class NumberPresenter {
    public static void main(String[] args) {
        showNumber(123);
    }

    public static void showNumber(int i) {
        System.out.println("binarnie: " + Integer.toBinaryString(i));
        System.out.println("ósemkowo: " + Integer.toOctalString(i));
        System.out.println("szesnastkowo: " + Integer.toHexString(i));
    }
}
