package lab;

public class BinaryConverter {

    public static void main(String[] args) {

        String binary = "1101";
        Long result = 0L;

        // 1  1  0  1 - liczba binarnie
        // 0  1  2  3 - indeks (i)
        // 3  2  1  0 - indeks odwrócony (długość - 1 - i)

        for(int i=0; i < binary.length(); i++) {

            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            //1 * 2^0 + 0 * 2^1 + 1 * 2^2 + 1 * 2^3
            result += bit * (int)Math.pow(2,i);
        }

        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");

    }
}
