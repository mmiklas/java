package results;

import java.math.BigInteger;

public class Checkers {
    public static void main(String[] args) {

        //jest problem czy typ long jest wystarczająco pojemny?
        long sum = 0;
        long last = 1;
        System.out.println("Proba wykorzystania zmiennych typu long");
        for (int i = 1; i < 65 ; i++) {
            sum += last;
            System.out.println("nr pola: "+ i + ", ziarna na polu: " + last + ", suma wszystkich ziaren: " + sum);
            last = last * 2;
        }

        System.out.println();

        //klasa BigInteger z pakietu math radzi sobie z takimi dużymi liczbami
        BigInteger bigSum = new BigInteger("0");
        BigInteger bigLast = new BigInteger("1");
        System.out.println("Przyklad wykorzystania typu obiektowego BigInteger");
        for (int j = 0; j < 65 ; j++) {
            bigSum = bigSum.add(bigLast);
            System.out.println("nr pola: "+ j + ", ziarna na polu: " + bigLast + ", suma wszystkich ziaren: " + bigSum);
            bigLast = bigLast.multiply(new BigInteger("2"));
        }
    }
}
