package Marathon.Day5;

public class Task1 {
    public static void main(String[] args) {

        //1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
        // Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
        // задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
        // Созданный вами класс должен отвечать принципам инкапсуляции.
        Car car = new Car();

        car.setYearOfIssue(2022);
        car.setColor("Белый");
        car.setModel("Cretta");

        System.out.println("Год выпуска машины: " +car.getYearOfIssue());
        System.out.println("Цвет машины: " + car.getColor());
        System.out.println("Модель машины: "+car.getModel());
    }
}
class Car{
        private int yearOfIssue;
        private String color;
        private String model;

    public int getYearOfIssue() {
        return yearOfIssue;

    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

