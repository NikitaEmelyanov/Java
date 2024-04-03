package Marathon.Day6;

public class Task1 {
    public static void main(String[] args) {

        //1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
        // в пакет текущего дня.
        //В классах Автомобиль и Мотоцикл реализовать два метода:
        //info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
        // yearDifference() - принимает на вход число (год), и возвращает разницу между переданным
        // годом и годом выпуска транспортного средства

        Motorbike moto = new Motorbike(2010,"Зеленый","BMW");
        Car car = new Car();
        Airplane airplane = new Airplane(1700,130,8600,0);

        car.setYearOfIssue(1998);
        airplane.setProducer("Russia");

        car.info();
        car.yearDifference();
        moto.info();
        moto.yearDifference();
        airplane.info();
        System.out.println();
        airplane.setFuel(airplane.fillUp());
        airplane.setFuel(airplane.fillUp());
        airplane.info();

    }
}
class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }
    int newYear = 2200;
    public int yearDifference(){
        int newYear2 = newYear - yearOfIssue;
        System.out.println("Разница между годом выпуска и новым введенным годом: " + newYear2);
        return newYear2;
    }
    public void info(){
        System.out.println("Это Мотоцикл");
    }
    private int getYearOfIssue() {
        return yearOfIssue;
    }

    private String getColor() {
        return color;
    }

    private String getModel() {
        return model;
    }
}
class Car{
    private int yearOfIssue;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это Автомобиль");
    }
    int newYear = 2200;
    public int yearDifference(){
    int newYear2 = newYear - yearOfIssue;
        System.out.println("Разница между годом выпуска и новым введенным годом: " + newYear2);
        return newYear2;
    }
    private int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }
}

//2. Создать класс Самолет (Airplane) с полями:
//- producer (изготовитель)
//- year (год выпуска)
//- length (длина)
//- weight(вес)
//- fuel (количество топлива в баке) + геттер для этого поля
//Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей
// класса (значение поля “количество топлива в баке” установить равным 0). В конструкторе для
// передачи полям значений использовать ключевое слово this. Помимо этого, в классе необходимо
// реализовать метод info(),который выводит сообщение в следующем формате:
//“Изготовитель: ... , год выпуска: ... , длина: ..., вес: ..., количество топлива в баке: ...”
// Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и
// заправляет топливный бак самолета на это значение.
//Создать новый объект класса Самолет с произвольными данными.
//Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза, передав разные
// значения. Вызвать метод info().

class Airplane{
    String producer;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    private int year;
    private int length;
    private int weight;
    public int fuel;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
    public void info(){
        System.out.println("Это Самолет");
        System.out.println("Изготовитель самолета: "+ producer);
        System.out.println("Год выпуска самолета: "+ year);
        System.out.println("Длинна самолета: "+ length+" m ");
        System.out.println("Вес самолета: "+ weight+" kg ");
        System.out.println("Количество топлива в самолете: "+ fuel +" l ");
    }
    public int fillUp(){
        this.fuel = fuel;
        return fuel +1000;
    }

    public Airplane(int year, int length, int weight, int fuel) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
}
