package Java.Les29_Polymorphism;

public class Les29_Polymorphism {
    public static void main(String[] args) {
        //Урок 29: Полиморфизм
        Animal animal = new Animal();
        animal.eat();



        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);


    }
    public static void test(Animal animal){
        animal.eat();
    }
}
