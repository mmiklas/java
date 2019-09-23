package results;

import java.math.BigDecimal;

public class CoinsCalculator {

    public static void main(String[] args) {
        CoinsCalculator coinsCalculator = new CoinsCalculator();

        System.out.println(coinsCalculator.calculateFloat(1000, .1f));
        System.out.println(coinsCalculator.calculateDouble(1000, .1f));
        System.out.println(coinsCalculator.calculateBigDecimal(1000, .1f));
    }

    float calculateFloat(int number, float coin) {
        float sum = 0;
        for (int i = number; i > 0; i--) {
            sum += coin;
        }
        return sum;
    }

    double calculateDouble(int number, float coin) {
        double sum = 0;
        for (int i = number; i > 0; i--) {
            sum += coin;
        }
        return sum;
    }

    BigDecimal calculateBigDecimal(int number, float coin) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = number; i > 0; i--) {
            BigDecimal coinBigDecimal = new BigDecimal(String.valueOf(coin));
            sum = sum.add(coinBigDecimal);
        }
        return sum;
    }

}
