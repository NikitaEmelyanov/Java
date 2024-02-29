package Java;

public class Les16_Return_tipe_methods {
    public static void main(String[] args) {
    //Урок 16: Тип возвращаемого значения метода.
    Person2 person1 = new Person2();
    person1.name = "Роман";
    person1.age = 50;
        person1.sayHello ();
        int year1= person1.calculateYearsToRetirement();

    Person2 person2 = new Person2();
    person2.name = "Вова";
    person2.age = 20;
        person2.speak ();
    //Для вызова метода и выполнения участка кода, который прописан в данном методе, нужно
    //обращаться к нему через . и название метода
        int year2 = person2.calculateYearsToRetirement();
        //При создании переменной для возвращения типа данных, например на основе int нельзя
        //возвращать данные из других типов данных и из методов, которые ничего не возвращают (void)
        System.out.println("Первому человеку до пенсии: "+year1 + "лет");
        System.out.println("Второму человеку до пенсии: "+year2 + "лет");
}
}
class Person2{
    String name;
    int age;
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
        // return возвращает выбранный тип данных и заканчивает метод, по этому после return нет
        //смысла ничего писать. Стоит отметить, что return не возвращает данные не подходящие по
        // типу данных, например в методе int нельзя возвращать String.

    }

    void speak(){
        System.out.println("Меня зовут "+ name + ","+ "мне "+ age +" "+ "лет");
    }
    void sayHello(){
        System.out.println("Привет");
    }
    // void - метод ничего не возвращает
}

