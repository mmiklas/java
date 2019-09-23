package results;

public class ComputationTest {
    public static void main(String[] args) {

        double x = 7;
        double y = 4;

        System.out.println("Dodawanie " + Computation.ADD.perform(x, y));
        System.out.println("Oejmowanie " + Computation.SUBSTRACT.perform(x, y));
        System.out.println("Mnożenie " + Computation.MULTIPLY.perform(x, y));
        System.out.println("Dzielenie " + Computation.DIVIDE.perform(x, y));
    }
}

enum Computation {

    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            return x / y;
        }
    };

    public abstract double perform(double x, double y);

}