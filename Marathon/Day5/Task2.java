package Marathon.Day5;

public class Task2 {
    public static void main(String[] args) {


        //2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”, “Модель”.
        // Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
        // Придерживаться принципов инкапсуляции и использовать ключевое слово this. Геттером
        // получить год выпуска, цвет, модель, вывести значения в консоль.

        Motorbike moto = new Motorbike(1998,"Black","Harley Davidson");

        System.out.println("Год выпуска мотоцикла: " +moto.getYearOfIssue());
        System.out.println("Цвет мотоцикла: "+ moto.getColor());
        System.out.println("Модель мотоцикла: "+ moto.getModel());
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

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}