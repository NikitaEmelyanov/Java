package JavaPRO.Les33_Lambda_Part_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compartor_for_Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("аb");

        //Стандартный компартор
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else  {
                    return 0;
                }
            }
        });
        System.out.println(list);

        //Компартор, который реализоваван с помощью лямбды выражений
        list.sort((s1,s2) -> {
            if (s1.length()>s2.length()) return 1;
            else if (s1.length()<s2.length()) return -1;
            else return 0;
        });
        System.out.println(list);

        //Лямбду выражение можно воспринимать как значение и записывает его в переменную
        Comparator<String> comparator = ((s1,s2) -> {
            if (s1.length()>s2.length()) return 1;
            else if (s1.length()<s2.length()) return -1;
            else return 0;
        });
        list.sort(comparator);
        //После занесения лямбды в переменную, эту переменную можно установить в качестве аргумента
        // в sort()
        System.out.println(list);
    }
}
