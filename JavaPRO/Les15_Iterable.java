package JavaPRO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Les15_Iterable {
    public static void main(String[] args) {
        //Урок 15: Интерфейс Iterable (Англ. - то по чему можно итерироваться/проходиться)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator(); //Возвращает объект класса Iterator

        //Раньше нужно было получить доступ к интерфейсу Iterator, и уже на основе данного интерфейса
        // можно было итерировать объекты с помощью методов этого интерфейса, но стоит отметить что,
        //for each под капотом так же использует итератор

        while (iterator.hasNext()) //Возвращает true, если в итераторе есть элементы и false, если нет

        System.out.println(iterator.next()); //Возвращает следующий элемент из списка
        //Итератор хранит в себе указатель на элемент объекта (область до объекта)






        //С появлением Java 5 появился такой способ итерирования, с помощью цикла for each
        for (int x : list)
            System.out.println(x);
        //Все классы Java Collections Framework (Коллекций) реализуют интерфейс Iterable, что
        // позволяет проходиться циклом for each по ним, чтобы такая возможность была в собственном
        //классе нужно реализовать интерфейс Iterable за счет создания Итератора

        //В момент прохождения по листу циклом for each нельзя изменять список, например методом
        //remove(), который удаляет элемент из списка, но можно изменять список при синтаксисе с
        //итератором


    }
}
