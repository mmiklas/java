import java.util.Random;

public class _CarParking {
    public static void main(String[] args) {

        String[] types = {"Yaris","Corolla","Aygo"};
        String[] colors = {"silver", "blue", "black"};
        int[] years = {2018, 2019, 2020};

        Random random = new Random();

        _Car[] parking = new _Car[100];
        for (int i=0; i<parking.length; i++) {
            String type = types[random.nextInt(2)];
            String color = colors[random.nextInt(2)];
            int year = years[random.nextInt(2)];
            parking[i] = new _Car(type, color, year);
        }

        for (_Car car : parking) {
            System.out.println(car);
        }
        //todo statystyki
    }
}

