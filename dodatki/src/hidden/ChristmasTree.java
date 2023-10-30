package hidden;

import java.util.Random;

public class ChristmasTree {
    public static void main(String[] args) {

        //domyślna wysokość choinki
        int height = 18;

        //sprawdzenie czy podano wysokość choinki jako argument programu
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        //pudełko z ozdobami
        char[] decorationBox = {'+', '.', '*', '~', '^', 'o'};

        Random random = new Random();
        char decoration;

        //liczba dekoracji, zaczynamy od jednej ozdoby (czubek)
        int decorationNumber = 1;

        //pętla przez wszystkie poziomy choinki (od czubka do maksymalnej wysokości)
        for (int i=0; i < height; i++) {

            //pętla do wyświetlenia pustych miejsc w wierszu
            for (int j=0; j<(height-i); j++) {
                System.out.print(' ');
            }

            //pętla to wyświetlenia ozdób w wierszu
            for (int j=0; j<decorationNumber; j++) {
                //losowanie ozdoby z pudełka
                decoration = decorationBox[random.nextInt(decorationBox.length)];
                System.out.print(decoration);
            }
            //zwiększenie o 2 ozdoby w następnym wierszu
            decorationNumber += 2;

            //przejście do nowej linii
            System.out.print('\n');
        }
    }
}
