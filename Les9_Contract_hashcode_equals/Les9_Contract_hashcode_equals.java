package Les9_Contract_hashcode_equals;

import java.util.*;

public class Les9_Contract_hashcode_equals {
    public static void main(String[] args) {
        //Урок 8: Методы hashcode() и equals()

    Map<Person,String> map = new HashMap<>();
    Set<Person> set = new HashSet<>();
    //Можно параметризовать объекты интерфейсов Set и Map любыми классами (В данном случае Person)

        Set<String> set1 = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");
        //Если создать объекты используя такой же синтаксис и Map и Set будут отображать их как
        // разные объекты, поскольку под каждый объект выделяется память

        set1.add("Hello");
        set1.add("Hello");

        System.out.println(set1);
        //Но при таком синтаксисе отобразиться только один Hello, так как Java не пропустит дубликат,
        //это происходит из-за скрытого метода equals(), который мы получаем от класса Object.
        //Реализация equals() в Set и Map сравнивает объекты и ссылки на них и таким образом
        // определяется дублика. Поскольку ссылка на оба объекта одинаковая, (поскольку не выделялась
        //память под эти объекты) equals() может посчитать что это один и тот же объект

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

    }
}

