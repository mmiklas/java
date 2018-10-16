package results;

import java.math.BigDecimal;

public class VatCalculator {

    public static final BigDecimal VAT_23 = new BigDecimal(".23");

    public static void main(String[] args) {
        VatCalculator vatCalculator = new VatCalculator();
        System.out.println("Obliczam podatek VAT " + vatCalculator.getVat(new BigDecimal("9.99")));
    }

    BigDecimal getVat(BigDecimal amount) {
        return amount.multiply(VAT_23);
    }

    float show1() {
        float amount=0;
        for(int i=1000; i>0; i--) {
            amount += 0.1f;
        }
        return amount;
    }

    double show2() {
        double amount=0;
        for(int i=1000; i>0; i--) {
            amount += 0.1d;
        }
        return amount;
    }

    BigDecimal show3() {
        BigDecimal amount=BigDecimal.ZERO;
        for(int i=1000; i>0; i--) {
            amount = amount.add(new BigDecimal("0.1"));
        }
        return amount;
    }


}
