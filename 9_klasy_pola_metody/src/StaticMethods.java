public class StaticMethods {

    public static void main(String[] args) {
        B b = new B();
        b.print(); //Tożsame z B.print();

        A a = b;
        a.print(); //Tożsame z A.print();
    }
}

class A {
    static void print() {
        System.out.println("A");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }
}