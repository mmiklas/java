public class Demo7 {
    public static void main(String[] args) {

        //instrukcje blokowe

        int x = 5;
        { //początek bloku
            int y = 10;
            y = y + x;
        } //koniec bloku

        //System.out.println(y); //BŁĄD! Brak zasięgu y!

        //instrukcja warunkowa if

        if (args.length < 3) {
            System.out.println("Za mało argumentów");
            System.exit(-1);
        }

        String server;
        if (args.length < 1) {
            server = "localhost";
        } else {
            server = args[0];
        }

        int a = 7;

        if (a < 0) {
            System.out.println("a mniejsze od zera");
        } else if (a > 0) {
            System.out.println("a większe od zera");
        } else {
            System.out.println("a równe zero");
        }

        //instrukcja warunkowa switch
        //byte and Byte
        //short and Short
        //int and Integer
        //char and Character
        //enum
        //String

        //napisać dla przykładu na if'ach
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie!");
        }


        //operator trójargumentowy

        //napisać to w if'ach
        //int ourBestScore = myScore > yourScore ? myScore : yourScore;

        //pętla for
        for (int i = 1; i < 100; i++) {
            System.out.println("i=" + i);
        }

        /*for (; ; ) {
            System.out.println("pętla nieskończona");
        }*/

        //pętla while

        int z = 0;
        while (z < 100) {
            System.out.println("z=" + z);
            z++;
        }

        //pętla do-while

        int j = 0;
        do {
            System.out.println("j=" + j);
            j++;
        } while (j < 100);

        //przerywanie pętli

        //continue
        //wypisz tylko parzyste
        for (int k = 1; k < 10; k++) {
            //sprawdź czy parzysta
            if (k % 2 == 1) {
                continue;
            }

            System.out.print(k);
            System.out.print(" ");
        }


        //nazwane pętle

        out:for(int q = 0; q < 10; q++) {
            for (int w = 0; w < 50; w++) {
                break out;
            }
        }
    }
}