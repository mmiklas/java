package lab;

public class Cat extends Animal {
    private static int counter;
    private static String type = "kot";


    public Cat() {
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
