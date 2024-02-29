package Java;

public class Les20_Constructors {
    public static void main(String[] args) {
        //Урок 20: Конструкторы
        Human1 human1 = new Human1("Bob", 34);

    }
}
class Human1{
    // Конструктор создается внутри класса, может иметь модификаторы доступа public, protected
    // и private и должен иметь название такое же как и класс, так же не нужно указывать void,
    // int, String и прочее для корректной работы
    public Human1(){
        //Конструкторы не имеют возвращаемого типа данных и и конструктора должно совпадать с классом
        System.out.println("Привет из первого конструктора!");
        this.name = "Имя по умолчанию";
        this.age = 0;

    }
    private String name;
    private int age;

    public Human1 (String name){
        System.out.println("Привет из второго конструктора");
        this.name=name;
// При перегрузке методов (то есть существует несколько методов с одним названием) мы можем вводить разные
//значения и будет выбираться подходящий метод автоматически. Методы должны отличаться или типом данных или
// количеством параметров, иначе методы будут считаться идентичными и будет отображаться ошибка
    }

    public Human1(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}