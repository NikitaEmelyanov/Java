package Java.Les34_Wildcards_of_Generics;

import java.util.ArrayList;
import java.util.List;

public class Les34_Wildcards_of_Generics {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        //То есть в данном листе могут храниться только объекты класса Animal
        listOfAnimal.add( new Animal(1));
        listOfAnimal.add( new Animal(2));

        test(listOfAnimal);

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add (new Dog());
        listOfDog.add (new Dog());

        test(listOfDog);
        //При вызове данного метода будет появляться ошибка, так как метод прописан для Класса Animal,
        // хоть Dog и все наследует от Animal полиморфизм так не работает, поскольку в качестве аргумента, у нас
        //прописано именно Animal, но если изменить Animal на ? все будет работать корректно. А знак ? будет
        // передавать в метод данные любых объектов



    }
    public static void test(List<? extends Animal> list){
        //При смене Animal на ? в <> мы сможем получать данные не от класса Animal, а любые данные, така механика
        //называется Wildcard
        // Далее указываем что, Wildcard должен все наследовать от Animal, для избежания ошибки в цикле, таким
        //образом наш Wildcard должен быть либо самим Animal, либо быть наследником Animal
        //Так же вместо extends можно указывать super, что будет говорить, что Wildcard может брать информацию от
        //Animal и классов родителей.

        //Иерархия наследования:
        //Object - Скрытый класс от которого наследуются все классы в Java
        //Animal - Класс родитель для Dog и класс наследник для Object
        //Dog - Класс наследник для Animal

        for (Animal animal : list){
            System.out.println(animal);
            animal.eat();
        }
    }
}
