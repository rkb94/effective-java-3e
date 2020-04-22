package chapter7.item42;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("55555", "333", "1", "4444", "22");

        // Anonymous Class
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Anonymous class : " + words);
        Collections.shuffle(words);

        // Lambda
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Using Lambda : " + words);
        Collections.shuffle(words);

        // Method reference
        Collections.sort(words, Comparator.comparingInt(String::length));
        System.out.println("Using Method reference : " + words);
        Collections.shuffle(words);

        // Method reference
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("Using Method reference in sort of List : " + words);
        Collections.shuffle(words);
    }
}
