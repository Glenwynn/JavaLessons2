package Lesson3;
import java.io.IOException;
import java.util.*;

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
