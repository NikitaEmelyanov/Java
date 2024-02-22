package Java.Les17_Method_Parameters;

public class Les17_Method_Parameters {
    public static void main(String[] args) {
        //Урок 17: Параметры метода.
        Person3 person1 = new Person3();
        person1.setNameAndAge("Роман", 20);

        person1.sayHello ();
        person1.speak();

        Person3 person2 = new Person3();
        String s1 ="Вова";
        person2.setNameAndAge(s1, 30);

        person2.speak ();
        //Для вызова метода и выполнения участка кода, который прописан в данном методе, нужно
        //обращаться к нему через . и название метода

        //При создании переменной для возвращения типа данных, например на основе int нельзя
        //возвращать данные из других типов данных и из методов, которые ничего не возвращают (void)

    }

static class Person3{
    String name;
    int age;

    void setNameAndAge(String user_name, int userage){
        name = user_name;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
        // return возвращает выбранный тип данных и заканчивает метод, по этому после return нет
        //смысла ничего писать. Стоит отметить, что return не возвращает данные не подходящие по
        // типу данных, например в методе int нельзя возвращать String.

    }

    void speak(){
        for (int i =0; i<3 ; i++)
        System.out.println("Меня зовут "+ name + ","+ "мне "+ age +" "+ "лет");
    }
    void sayHello(){System.out.println("Привет");}
    // void - метод ничего не возвращает


     }

// Параметров может быть сколько угодно

}