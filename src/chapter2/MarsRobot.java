package chapter2;

public class MarsRobot {
    public String status;
    public int speed;
    public float temperature;

    void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
}
