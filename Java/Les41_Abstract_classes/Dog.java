package Java.Les41_Abstract_classes;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        // Поскольку при наследовании, мы получили доступ к абстрактному методу, описанному в
        // родительском классе нужно воспользоваться аннотацией и Override, чтобы реализовать
        // данный метод в классе наследнике без ошибок.
        System.out.println("bark");
    }
}

