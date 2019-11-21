public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("9d");
        System.out.println("Oto nasz liczba pomnożona przez 99: " + (i * 99));
    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("Coś poszło nie tak! Upewnij się, że przekazywany string jest liczbą!");
        }
        return -1;
    }
}