public class Outer {

    public class Inner {}

    public Inner instantiate() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner1 = outer.instantiate();
        Inner inner2 = outer.new Inner();
    }
}