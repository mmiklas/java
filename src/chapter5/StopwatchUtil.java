package chapter5;

public class StopwatchUtil {

    private long startTime;
    private long stopTime;

    void start() {
        startTime=System.currentTimeMillis();
    }

    void stop() {
        stopTime= System.currentTimeMillis();
    }

    void showResult(String label) {
        if (label!=null) {
            System.out.print(label + ": ");
        }
        System.out.println("czas " + (stopTime - startTime) + " ms");
    }
}
