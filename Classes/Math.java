package Classes;

public class Math {
    public static void main(String[] args) {
        //Класс Random

        for (int i = 0; i < 100; i++) {
            System.out.println(java.lang.Math.round(java.lang.Math.random()*10));
            //Метод random() класса Math дает возможность получить псевдослучайное число от 0 до 1
            //Метод ceil() класса Math округляет число в большую сторону
            //Метод round() класса Math округляет до целого значения, в зависимости от десятичной части
            //Метод floor() класса Math округляет в меньшую сторону
        }
    }
}
