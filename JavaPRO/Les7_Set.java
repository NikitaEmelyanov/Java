package JavaPRO;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Les7_Set {
    public static void main(String[] args) {
        //Урок 7 : Множества (Set)
        //Классы интерфейса Set хранят в себе объекты, как и классы интерфейса List, но в
        //Set нельзя хранить одинаковые элементы
        Set<String> hashSet = new HashSet<>();
        // Не гарантирует порядок вывода
        Set<String> linkedHashSet = new HashSet<>();
        //Порядок ввода будет равен порядку вывода
        Set<String> treeSet = new TreeSet<>();
        //Так же сортируется с помощью естественного порядка Java

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        //hashSet используется чаще всего так как он самый быстрый, и чаще всего порядок
        //в Set не важен

        for (String name : hashSet){
            System.out.println(name);
        }
        System.out.println();

        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");
        linkedHashSet.add("George");
        linkedHashSet.add("George");
        //Дубликаты будут игнорироваться в Set и никак не будут выводиться

        for (String name : linkedHashSet){
            System.out.println(name);
        }
        System.out.println();

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name : treeSet) {
            System.out.println(name);
        }

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        //Метод contains(элемент) возвращает true, если объект есть в этом Set и
        // возвращает false, если такого объекта нет. Данный метод работает в Set очень
        //быстро, так как использует хеширование

        System.out.println(hashSet.isEmpty());
        //Метод isEmpty() возвращает true, если Set пустой и возвращает false если в Set
        //есть элементы



        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        //union - объединения множеств
        //Для объединения множеств создается новое множество которое будет содержать все
        //объекты в единственном экземпляре, так как в Set нет дубликатов
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        //addAll Метод для объединения множеств
        System.out.println(union);


        //intersection - Пересечения множеств
        //Пересечение множеств это только те значения, которые есть в обоих множествах
        //и так же записывается в новое множество
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        //retainAll() метод для пересечения множеств
        System.out.println(intersection);


        //difference - разность множеств
        //Разность множеств это те значения, которые после вычитания ВТОГО множества
        //из ПЕРВОГО останутся или наоборот ПЕРВОГО из ВТОРОГО
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        //Метод removeAll() удаляет все объекты из начального Set, которые присутствуют
        //в Set, который передается в качестве аргумента
        System.out.println(difference);
    }
}
