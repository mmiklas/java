package results;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {

        MonteChristo monteChristo = new MonteChristo();
        List<String> allLines = monteChristo.loadTextFile("src/crsto10.txt");

        if (allLines != null && !allLines.isEmpty()) {
            System.out.println("Wczytany plik zawiera " + monteChristo.countLines(allLines) + " linii");
            monteChristo.showEveryHundredthLine(allLines);
            monteChristo.showTheLongestVerse(allLines);
        }

    }

    List<String> loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku!");
            e.printStackTrace();
        }
        return null;
    }

    int countLines(List list) {
        return list.size();
    }

    void showEveryHundredthLine(List list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(i + " " + list.get(i));
            }
        }
    }

    void showTheLongestVerse(List<String> list) {
        String longestLine = "";
        for (String line : list) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("\nNajdłuższy wiersz w książce zawiera " + longestLine.length() + " znaki/ków - " + longestLine.toUpperCase());
    }


}
