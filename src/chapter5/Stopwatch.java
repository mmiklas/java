package chapter5;

public class Stopwatch {

    private long startTime;
    private long stopTime;

    public void start() {
        startTime=System.currentTimeMillis();
    }

    public void stop() {
        stopTime= System.currentTimeMillis();
    }

    public void showResult(String label) {
        if (label!=null) {
            System.out.print(label + ": ");
        }
        System.out.println("czas " + (stopTime - startTime) + " ms");
    }
}
