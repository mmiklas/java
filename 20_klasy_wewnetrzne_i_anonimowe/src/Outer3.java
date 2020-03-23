public class Outer3 {

    public static class Inner {}

    public Inner instatiate() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Inner inner1 = outer3.instatiate();
        Inner inner2 = new Inner();
    }
}