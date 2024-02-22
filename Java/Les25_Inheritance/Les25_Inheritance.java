package Java.Les25_Inheritance;

public class Les25_Inheritance {
    public static void main(String[] args) {
        //Урок 25: Наследование
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.eat();
        dog.showName();


    }
}
