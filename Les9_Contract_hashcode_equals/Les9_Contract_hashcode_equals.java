package Les9_Contract_hashcode_equals;

import java.util.*;

public class Les9_Contract_hashcode_equals {
    public static void main(String[] args) {
        //Урок 8: Методы hashcode() и equals()

    Map<Person,String> map = new HashMap<>();
    Set<Person> set = new HashSet<>();

        Set<String> set1 = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        set1.add("Hello");
        set1.add("Hello");

        System.out.println(set1);

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

    }
}

