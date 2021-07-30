package Lesson3;

import java.util.*;

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
        phoneBook.add("Gromov", "89992561543");
        phoneBook.add("Sidorov", "89231234565");
        phoneBook.add("Kuznetsov", "89996543223");
        phoneBook.add("Klimov", "89673216565");
        phoneBook.add("Zhdanov", "89566549889");
        phoneBook.add("Gagarin", "89529875665");
        phoneBook.add("Burtyxin", "89253546556");


        System.out.println("Lesson 3 task 2");
        System.out.println(phoneBook.get("Kuznetsov"));
        System.out.println(phoneBook.get("Klimov"));
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Burtyxin"));
    }
}

class PhoneBook {
    private Map<String, List<String>> phonebook_human = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phonebook_human.containsKey(surname)) {
            phone_number_list = phonebook_human.get(surname);
            phone_number_list.add(phone_number);
            phonebook_human.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phonebook_human.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phonebook_human.get(surname);
    }

}