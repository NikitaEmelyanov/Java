package Java;

public class Les24_Class_Object_and_toString {
    public static void main(String[] args) {
        //Урок 24: Класс Object и метод toString()
        String string = "Hello";
        System.out.println(string);
        //Все классы в Java наследуют скрытый класс Object
        //Метод .toString возвращает хэш код выбранного объекта и представляет объект в виде строки
        //Хэш код это уникальный номер каждого объекта
        Qwerty h1 = new Qwerty("Макс", 300);
        System.out.println(h1);
    }
}
class Qwerty{
    private String name;
    private int age;
    public Qwerty( String name , int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        //Если есть необходимость можно переопределить метод toString и задать другие значения,
        //тогда объект в виде строки будет иметь вид согласно тому, который мы указали при
        // переопределении
        return name+","+age;

    }
}