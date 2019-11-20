public class LettersApp {

    public static void main(String[] args) {

        A a = new A();
        a.introduce();

        B b = new B();
        b.introduce();

        Letter letter1 = new A();
        Letter letter2 = new B();

        letter1.introduce();
        letter2.introduce();

        A aa = new B();
        aa.introduce();

    }
}

interface Letter {
    void introduce();
}

class A implements Letter{
    public void introduce() {
        System.out.println("Jestem A");
    }
}

class B extends A implements Letter {
    public void introduce() {
        System.out.println("Jestem B");
    }
}


