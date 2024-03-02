package JavaPRO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Les11_Comparator_1 {
    public static void main(String[] args) {
        //Урок 11: Интерфейс Comparator(Англ. тот кто сравнивает) - Сортировка объектов
        List<Person123> people = new ArrayList<>();
        people.add (new Person123 ( 3,"Mike"));
        people.add (new Person123 ( 1,"Bob"));
        people.add (new Person123 ( 2,"Katy"));

        Collections.sort(people, new Comparator<Person123>() {
            //При сортировке объектов будет ошибка, так как мы не указали в классе Person порядок
            //сортировки
            @Override
            public int compare(Person123 o1, Person123 o2) {
                if (o1.getId()> o2.getId()){
                    return 1;
                }else if (o1.getId()< o2.getId()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(people);
        //Таким образом в классе Person не указан естественный порядок, но мы сделали сортировку по
        //id c помощью Компартора, который мы передали в качестве второго аргумента , используя
        // метод получения id, через создание Геттера в классе Person


        List<String> animals = new ArrayList<>();
        animals.add("Frog");
        animals.add("Elephant");
        animals.add("Dog");
        animals.add("I");
        animals.add("Bird");
        animals.add("Cat");
        animals.add("Koala");

        Collections.sort(animals);
        //Класс Collections хорошо подходит для работы с коллекциями, тут много полезных методов
        //Метод sort () позволяет сортировать объекты по естественному порядку. В документации
        //метода, можно так же указать второй аргумент, если мы хотим отсортировать объекты
        //способом, который описывается в реализации интерфейса Comparator. При установке второго
        //аргумента естественный порядок учитываться не будет.
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() {
            //Так же можно не создавать отдельный класс, для реализации одного метода интерфейса,
            //а использовать анонимный класс и сразу указать такой синтаксис в аргументе и
            // сразу реализовать метод интерфейса, не создавая новый класс

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
    }
}
class StringLengthComparator implements Comparator<String> {
    // Если нужно сравнить объекты не по естественному порядку, нужно реализовать интерфейс
    // Comparator. Данный интерфейс параметризован, поэтому указываем параметр. При реализации
    //интерфейса с помощью метода compare, в реализации метода можно указать как должны сравниваться
    // объекты, например, если это строка не лексикографически, а по длине
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }

        //Метод compare возвращает целое число и за счет этого понимает какой объект больше, какой
        //меньше, но сам метод нужно самостоятельно реализовать
        //о1 > о2 => 1;           compare(2,1) => 1
        //о1 < о2 =>-1;           compare(1,2) => -1
        //о1 == о2 =>0;           compare(1,1) => 0

    }
}
class Person123 {

    private int id;
    private String name;

    public Person123(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person123{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}