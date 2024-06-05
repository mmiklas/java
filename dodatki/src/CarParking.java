import java.util.Random;

public class CarParking {
    public static String[] TYPES = {"Yaris", "Corolla", "Aygo"};
    public static String[] COLORS = {"silver", "blue", "black"};
    public static int[] YEARS = {2018, 2019, 2020};

    public static int MOTOMACHI_CAPACITY = 5000;
    public static int TSUTSUMI_CAPACITY = 4500;
    public static int TAHARA_CAPACITY = 1700;

    public static void main(String[] args) {
        Car[] motomachi = new Car[MOTOMACHI_CAPACITY];
        Car[] tsutstumi = new Car[TSUTSUMI_CAPACITY];
        Car[] tahara = new Car[TAHARA_CAPACITY];

        generateCars(motomachi);
        generateCars(tsutstumi);
        generateCars(tahara);

        // stats 1 - silver Yaris 2020 Motomachi - how many cars of this type?
        int silverYaris2020Motomachi = 0;
        for (Car car : motomachi) {
            if ("Yaris".equals(car.getType()) && "silver".equals(car.getColor()) && 2020 == car.getYear()) {
                silverYaris2020Motomachi++;
            }
        }
        System.out.println("Motomachi - srebrnych Toyot Yaris z 2020 roku jest: " + silverYaris2020Motomachi);

        // stats 2 - Tsustsumi - what color of cars are there the most?
        int[] colorsCountTsutsumi = new int[3];
        for (Car car : tsutstumi) {
            switch (car.getColor()) {
                case "silver":
                    colorsCountTsutsumi[0]++;
                    break;
                case "blue":
                    colorsCountTsutsumi[1]++;
                    break;
                case "black":
                    colorsCountTsutsumi[2]++;
                    break;
            }
        }
        int mostCommonColorIndex = 0;
        for (int i = 1; i < colorsCountTsutsumi.length; i++) {
            if (colorsCountTsutsumi[i] > colorsCountTsutsumi[mostCommonColorIndex]) {
                mostCommonColorIndex = i;
            }
        }
        System.out.println("\nTsustsumi - najczesciej pojawiaja się samovhód w kolorze: " + COLORS[mostCommonColorIndex]);

        // stats 3 - Tahara - information about the first 10 cars
        System.out.println("\nTahara - informacje o pierwszych 10 samochodach:");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i].toString());
        }
    }

    public static void generateCars(Car[] parking) {
        Random random = new Random();
        for (int i = 0; i < parking.length; i++) {
            String type = TYPES[random.nextInt(3)];
            String color = COLORS[random.nextInt(3)];
            int year = YEARS[random.nextInt(3)];
            parking[i] = new Car(type, color, year);
        }
    }
}

