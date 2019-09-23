package chapter5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) throws Exception {
        Set<String> words = new HashSet<>();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String word = in.next();
            words.add(word);
        }

        System.out.println(words.size() + " unikalnych słów");
    }
}

