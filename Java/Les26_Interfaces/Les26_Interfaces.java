package Java.Les26_Interfaces;

public class Les26_Interfaces {
    //Урок 26: Интерфейсы
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        I_info info1 = new Animal(1);
        I_info info2 = new Person("Bob");
        //Поскольку классы Animal и Person реализуют интерфейс I_info возможно создавать
        //объекты с выделенной памятью в этих классах, относительно данного интерфейса
        info1.showInfo();
        info2.showInfo();
        outPutInfo(info1);
        outPutInfo(info2);

        outPutInfo(animal1);
        outPutInfo(person1);
    }
    public static void outPutInfo (I_info info){
        info.showInfo();
        // Теперь можно реализовывать интерфейс с помощью с помощью обоих классов благодаря
        //связи, через последний метод (поскольку он принимает на вход метод реализуемый в
        //других классах)
    }
}
