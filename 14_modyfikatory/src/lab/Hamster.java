package lab;

public class Hamster extends Animal {
    private static int counter;
    private static String type = "chomik";


    public Hamster() {
        counter++;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }

    @Override
    String getType() {
        return type;
    }
}
