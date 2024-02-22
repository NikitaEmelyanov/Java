package Java.Les32_UpCasting_DownCasting;

public class Les32_UpCasting_DownCasting {
    public static void main(String[] args) {
        //Урок 32: Восходящие и нисходящие преобразования.
        Dog dog = new Dog();
        Animal animal = new Dog();
        // Такая конструкция называется Upcasting - восходящее преобразование
        // А восходящим оно является потому что, класс Dog наследует все от
        //класса Animal и по иерархии находится ниже, так как Dog наследник.
        //Стоит отметить что java делает неявное преобразование при Upcasting


        Dog dog2 = (Dog) animal;
        //Такая конструкция называется Downcasting - нисходящее преобразование
        // Обратная механика, класс стал ниже по иерархии наследования и
        //здесь уде используется явное преобразование
        dog2.bark();
        //Downcasting не всегда безопасно для использования, так как можно
        // потерять часть функционала

//        Animal animal1 = new Animal();
//        Dog dog3 = (Dog) animal1;
//        System.out.println(dog3.bark();
        //Например при вызове метода bark() будет появляться ошибка, так
        //как у класса animal нет данного метода


    }
}
