package JavaPRO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Les13_Queue {
    public static void main(String[] args) {
        //Урок 13 : Очередь (Queue)

        //Объекты можно доставать из Queue в том же порядке в котором они были помещены. First in /
        //First out (FiFo). Очень часто используется, например при многопоточности, если несколько
        //потоков используют один ресурс этим потокам нужно обеспечить очередность, и поток, который
        //пришел первый он должен получить доступ к ресурсу раньше всех.

        Person2 person1 = new Person2(1);
        Person2 person2 = new Person2(2);
        Person2 person3 = new Person2(3);
        Person2 person4 = new Person2(4);

        Queue<Person2> people = new LinkedList<>();
        //Такой синтаксис возможен, так как класс LinkedList реализует и интерфейс List и интерфейс
        // Queue
        people.add(person3);
        // add() метод для добавления элементов (в паре с remove())
        // offer() метод для  элементов (в паре с poll())
        // remove() метод для удаления элемента первого в очереди (в паре с add())
        // poll() метод для удаления элементов (в паре с offer())
        //Функционал методов одинаковый, но
        // Методы add() и remove() выбрасывают исключения при ошибке
        //Методы offer() и poll() возвращают специальное значение при ошибке

        people.add(person2);
        people.add(person4);
        people.add(person1);

            System.out.println(people.remove());

        Queue<Person2> people2 = new ArrayBlockingQueue<Person2>(3);
        //У ArrayBlockingQueue в отличии от LinkedList нужно указать максимальный размер очереди в
        //качестве аргумента, это нужно для того, чтобы ограничить размер очереди
        System.out.println(people2.offer(person3));
        System.out.println(people2.offer(person2));
        System.out.println(people2.offer(person4));
        System.out.println(people2.offer(person1));


        System.out.println(people2.peek()); // Для показа элемента из очереди, без удаления


    }
}
class Person2{
    private int id;

    public Person2(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                '}';
    }
}