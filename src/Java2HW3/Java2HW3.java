package Java2HW3;

import java.io.IOException;
import java.util.*;

public class Java2HW3 {

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

        for (int i = 0; i < words.length; i++) {
            if (tw.containsKey(words[i]))
                tw.put(words[i], tw.get(words[i]) + 1);
            else
                tw.put(words[i], 1);
        }

        System.out.println("The lessons 3 task 1");
        System.out.println(tw);
        System.out.println("\n");
    }

    private static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Lihachev", "89254693322");
        phoneBook.add("Burtyxin", "89168856235");
        phoneBook.add("Gromov", "89992561543");
        phoneBook.add("Averin", "89231234565");
        phoneBook.add("Lihachev", "89996543223");
        phoneBook.add("Gromov", "89673216565");
        phoneBook.add("Lihachev", "89566549889");
        phoneBook.add("Burtyxin", "89529875665");
        phoneBook.add("Burtyxin", "89253546556");


        System.out.println("The lessons 3 task 2");
        System.out.println(phoneBook.get("Lihachev"));
        System.out.println(phoneBook.get("Gromov"));
        System.out.println(phoneBook.get("Burtyxin"));
        System.out.println(phoneBook.get("Averin"));
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