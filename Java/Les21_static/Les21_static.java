package Java.Les21_static;

public class Les21_static {
    public static void main(String[] args) {
        //Урок 21: Ключевое слово static.
        Human2 h1 = new Human2("Bob",40);
        Human2 h2 = new Human2("Tom",30);
        Human2.description = "Nice";
        h1.getAllField();
        h2.getAllField();
        Human2.description = "Bad";
        h1.getAllField();
        h2.getAllField();
        System.out.println(Math.pow(2,4));
        //Mach - статический класс который не нужно импортировать .pow (метод Степени) (2,4).
        // 2 -число, 4 - степень. К данной статической коллекции можно обращаться напрямую, не создавая
        //и не импортирую, у данного класса нет переменных объектов, а есть только статические переменные
        //(переменные класса)
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3 = new Human2("Rob",50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}
class Human2{

    private String name;
    private int age;
    public static String description;
    public static int countPeople;

    public Human2 (String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void getAllField(){
       System.out.println(name + "," +age+","+description);
    }
    //Статические методы могут работать только со статическими переменными, так же статические
    //методы не могут работать с переменными объекта. Статический метод общий для всех объектов

    public void printNumberOfPeople(){
        System.out.println("Number people is "+ countPeople);
    }

}