package Java.Les26_Interfaces;

public class Person implements I_info {
    //Класс может реализовать в себе любое количество интерфейсов, для этого их нужно указывать
    //через запятую, но класс может наследовать (extends) только один класс

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");

    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+this.name);

    }
}
