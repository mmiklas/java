package results;

import chapter2.MarsRobot;

public class MarsApplication2 {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        System.out.println("\nDuch:");
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        //Lab2.1
        MarsRobot opportunity = new MarsRobot();
        System.out.println("\nOkazja:");
        opportunity.status = "eksploracja";
        opportunity.speed = 4;
        opportunity.temperature = -90;
        opportunity.showAttributes();
    }
}
