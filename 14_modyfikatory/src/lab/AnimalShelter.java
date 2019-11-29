package lab;

import java.util.Random;

public class AnimalShelter {

    public static int PEN_NUMBER = 33;

    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[100];

        for(int i = 0; i < 100; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
            }
        }

        System.out.print("W " + PEN_NUMBER + " kojcu zanjduje się " + animals[PEN_NUMBER].getType());
        System.out.println(", wszystkich jest " + animals[PEN_NUMBER].getInstanceNumber()+ " sztuk.");

    }
}
