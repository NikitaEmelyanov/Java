package Java.Les48_Enum;

public class Les48_Enum {
    public static void main(String[] args) {
        //Урок 48: Enum (Перечисления).
        Animal animal = Animal.CAT;
        //С появлением enum мы не можем поместить переменные не находящиеся в enum
        System.out.println(animal.getTranslation());

        System.out.println(animal);

        switch (animal){
            case CAT :
                System.out.println("It's a cat! ");
            case DOG :
                System.out.println("It's a dog! ");
                break;

        }
        Season season = Season.WINTER;

        System.out.println(season.getTemperature());

        //Иерархия наследования для всех enum класса Season(Enum)
        //Object -> Enum -> Season(Enum)
        System.out.println(season instanceof Object);
        //Ключевое слово instanceof проверяет являться ли объект часть этого класса
        //Поскольку у нас установлена данная иерархия наследования, можно увидеть, что объект
        //класса Season так же является объектом классов Enum и Object, поскольку они являются
        //родителями Season
        System.out.println(season.getClass());
        //Метод getClass() класса Object при вызове на объекте дает класс объектом которого он
        //(объект) является

        switch (season){
            case SUMMER -> System.out.println("It's warm outside");
            case WINTER -> System.out.println("It's cold outside");
            //При таком синтаксисе break не нужен

        }
        //Полезные методы класса Enum:
        Season season1 = Season.AUTUMIN;
        System.out.println(season1.name());
        System.out.println(animal.name());
        //Метод name() возвращает название Enum в виде строки в первоначальном виде

       Animal frog =  Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        //Метод ValueOf - нужен когда нужно из строки получить Enum

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
        //Так как при создании Enum каждому из них присваивается свой индекс в зависимости от
        //очередности ввода, метод ordinal() показывает индекс выбранного Enum. Индексация
        //объектов в Enum, так же как и в массивах начинается с 0



    }


}
