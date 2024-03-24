package JavaPRO;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Les_33_Lambda_Part_2 {
    public static void main(String[] args) {
        //Урок 34: Лямбда - выражения. Использование лямбды выражений в методах, которые оперируют
        // на коллекциях и массивах(часть II)

        int [] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        //map() method
        arr1 = Arrays.stream(arr1).map(a -> a*2).toArray();
        //stream() - Статический метод класса Arrays, который принимает на вход массив и преобразует
        // его в поток, это нужно потому что лямбда не может оперировать сразу на листе, но может
        // оперировать на потоке
        //map() - специальный метод, который позволяет изменять наборы данный, если точнее, метод
        // берет каждый элемент из набора данных и сопоставляет ему новый элемент, далее нужно описать
        // сопоставление с помощью лямбды выражения в аргументе, после чего метод возвращает в набор
        // данных новый элемент на место старого
        //toArray() преобразует поток обратно в массив
        list1 = list1.stream().map(a -> a*2).toList();
        //toList() преобразует поток обратно в лист, обратное преобразование нужно потому то map()
        // обновляет данные в потоке и напрямую приравнять поток с листом или массивом нельзя,
        // поскольку используются разные типы данных

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        arr1 = Arrays.stream(arr1).map(a->3).toArray();
        arr1 = Arrays.stream(arr1).map(a->a+1).toArray();

        System.out.println(Arrays.toString(arr1));

        //filter() method - метод фильтрующий данные
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a->a % 2==0).toArray();
        list2 = list2.stream().filter(a->a % 2==0).toList();
        //filter() проходится по каждому элементу массива и возвращает true, если элемент
        // соответствует критерию фильтра и false, если нет, сам критерий нужно описать в виде лямбды
        // выражения в качестве аргумента

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //forEach() method
        Arrays.stream(arr2).forEach(System.out::println);
        list2.stream().forEach(System.out::println);
        //метод forEach() позволяет пройтись по всех элементам, в общем то ничем не отличается от
        // цикла, но сокращает код
        //Если в лямбде ничего не делается кроме вывода на экран, среда разработки подсказывает,
        // что можно сократить выражение (a ->System.out.println a) в System.out::println)

        //reduce() method берет набор данных и сжимает его в 1 элемент
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum1 = Arrays.stream(arr3).reduce((acc, b)-> acc +b).getAsInt();
        //В методе reduce() будет 2 аргумента, где 1- это аккумулятор (acc), а 2 - текущий элемент.
        // Аккумулятор соответственно аккумулирует данные, то есть это будет переменная счетчик,
        // которая будет каждый раз обновляться. Для назначения изначального значения аккумулятора
        // нужно предать это значение в качестве аргумента дополнительно в начале, это будет
        // выглядеть так (0, acc, b). Если не указать значение аккумулятора, то итерация начнется
        // со второго элемента, а первый элемент станет аккумулятором
        //getAsInt() преобразует поток в целое число
        int sum2 = list2.stream().reduce((acc,b)->acc * b).get();
        //Обычно перед вызовом метода get() нужно вызывать метод ifPresent(), который проверяет
        // есть элементы или нет

        System.out.println(sum1);
        System.out.println(sum2);



        int[] arr4 = new int[10];
        fillArr(arr4);

        int[] newArray = Arrays.stream(arr4).filter(a-> a % 2 !=0).map(a -> a*2).toArray();
        System.out.println(Arrays.toString(newArray));
        //Методы можно вызывать один за другим используя полученный результат полученного от
        // предыдущего метода

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a*3).collect(Collectors.toSet());
        //Везде, кроме массивов желательно использовать такой синтаксис для корректной работы
        // collect(Collectors.toSet());
        System.out.println(set);
        //Все вышеперечисленные методы можно использовать и на коллекциях
    }



    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++)
            list.add(i+1);
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++)
            arr[i] = i+1;
    }
}
