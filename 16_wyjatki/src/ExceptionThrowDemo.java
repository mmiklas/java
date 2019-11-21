public class ExceptionThrowDemo {

    public static void main(String[] args) {

        ExceptionThrowDemo etd = new ExceptionThrowDemo();

        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = etd.getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException exception) {
            numberOfSeconds = etd.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }

    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}
