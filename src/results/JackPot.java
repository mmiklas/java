package results;

import java.util.Random;

public class JackPot {
    public static final int BETS_NUMBER = 1_000;

    public static void main(String[] args) {

        Random random = new Random(999999999L);
        Bet[] bets = new Bet[BETS_NUMBER];
        Bet jackPot = new Bet(7, 7, 7);

        for (int i = 0; i < bets.length; i++) {
            bets[i] = new Bet(random);
        }

        for (Bet bet : bets) {
            if (jackPot.equals(bet)) {
                System.out.println("JACKPOT!!!");
            }
        }
    }
}

class Bet {
    int x;
    int y;
    int z;

    public Bet(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Bet(Random random) {
        this.x = draw(random);
        this.y = draw(random);
        this.z = draw(random);
    }

    private int draw(Random random) {
        return random.nextInt(10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bet bet = (Bet) o;

        if (x != bet.x) return false;
        if (y != bet.y) return false;
        return z == bet.z;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
