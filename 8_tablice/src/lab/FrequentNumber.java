package lab;

public class FrequentNumber {

    public static void main(String[] args) {

        int[] arr = {3, 5, 3, 6, 8, 8, 8, 8, 3, 3, 3, 0};
        int[] counters = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.println("Najczęściej występującą cyfrą w tablicy jest " + mostFrequent + ", wystąpiła " + counters[mostFrequent] + " razy.");

    }
}
