class Outer4 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Outer3.Inner inner1 = outer3.instatiate();
        Outer3.Inner inner3 = new Outer3.Inner();
    }
}