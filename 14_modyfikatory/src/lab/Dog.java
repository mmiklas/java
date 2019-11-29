package lab;

public class Dog extends Animal {
    private static int counter;
    private static String type = "pies";


    public Dog() {
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
