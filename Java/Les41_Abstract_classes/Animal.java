package Java.Les41_Abstract_classes;

public abstract class Animal {
    public void eat(){
        System.out.println("I am eating...");

    }
    public abstract void makeSound();
    // При создании абстрактного метода не нужно указывать тело метода {}, так как он не требует
    // реализации, а требует только описания, поэтому завершаем строку с помощью ; Абстрактные
    //методы можно создавать только внутри абстрактных классов
}
