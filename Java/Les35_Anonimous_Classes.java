package Java;

interface AbleToEat{
    public void eat();
}

public class Les35_Anonimous_Classes {
    public static void main(String[] args) {
        //Урок 35: Анонимные классы

        //Анонимные классы нужно использовать когда есть объект, который очень похож на
        // основной объект, но при этом имеет существенные отличия
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal() {
            public void eat (){
                System.out.println("Other animal is eating....");
            }
        };
        //Для того чтобы не создавать отдельный класс OtherAnimal например есть нужно только
        //переопределить метод eat() внутри нашего действующего класса, так как создается
        //скрытый анонимный класс наследник Animal, данную задачу можно реализовать не создавая
        //дополнительный класс.
        animal2.eat();
    }
}

class Animal implements AbleToEat{
    public void eat(){
        System.out.println("Animal is eating...");

    }
}
class Test{
    AbleToEat ableToEat = new AbleToEat() {
        @Override
        public void eat() {
            System.out.println("Someone is eating....");
        }
    };

}