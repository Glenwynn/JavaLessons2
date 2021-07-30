package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class Lesson3 {

    public static void main(String[] args) {
        theWords();
        phoneBook();
    }

    private static void theWords() {
        Map<String, Integer> tw = new HashMap<>();
        String[] words = {
                "Teem", "Test", "Best",
                "Good", "Word", "Human",
                "Such", "This", "Even",
                "Near", "Self", "Teem",
                "This", "Word", "Near",
                "Such", "Even", "Near", "Even"
        };

        for (String word : words) {
            if (tw.containsKey(word))
                tw.put(word, tw.get(word) + 1);
            else
                tw.put(word, 1);
        }

        System.out.println("Lesson 3 task 1");
        System.out.println(tw);
        System.out.println("\n");
    }

    private static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "89254693322");
        phoneBook.add("Petrov", "89168856235");
        phoneBook.add("Sidorov", "89992561543");
        phoneBook.add("Kuzmin", "89231234565");
        phoneBook.add("Zhdanov", "89996543223");
        phoneBook.add("Gromov", "89673216565");
        phoneBook.add("Sergeev", "89566549889");
        phoneBook.add("Vovkin", "89529875665");
        phoneBook.add("Klimov", "89253546556");


        System.out.println("Lesson 3 task 2");
        System.out.println(phoneBook.get("Kuzmin"));
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Vovkin"));
        System.out.println(phoneBook.get("Gromov"));
    }
}
