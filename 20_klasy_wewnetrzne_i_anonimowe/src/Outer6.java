import java.util.Arrays;

public class Outer6 {

    private static void localClassInstantiate(String[] args) {
        class LocalClass {

            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

    public static void main(String[] args) {
        Outer6.localClassInstantiate(args);
    }
}