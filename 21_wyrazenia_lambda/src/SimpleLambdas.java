import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class SimpleLambdas {
    public static void main(String[] args) {
        SimpleMultiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(2));

        Introducer introducer = name -> System.out.println("Cześć! Mam na imię " + name + "!");
        introducer.run("Marcin");

        //Korzystamy z gotowych interface'ów funkcyjnych
        UnaryOperator<Integer> uo = o -> o * o;
        System.out.println(uo.apply(2));

        Consumer<String> consumer = s -> System.out.println("Cześć! Mam na imię " + s + "!");
        consumer.accept("Marcin");
    }
}

@FunctionalInterface
interface SimpleMultiplier {
    int perform(int x);
}

@FunctionalInterface
interface Introducer {
    void run(String name);
}
