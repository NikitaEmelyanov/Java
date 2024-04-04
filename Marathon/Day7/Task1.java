package Marathon.Day7;

/**
 * 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 * В классе Самолет создать статический метод compareAirplanes, который в качестве аргументов
 * принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
 *  какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Airplane2 airplane2 = new Airplane2();
        Airplane airplane = new Airplane();

        airplane.setLength(170);
        airplane2.setLength(130);

        airplane.compareAirplanes();
    }
}
class Airplane{
    public static int length;

    public void setLength(int length) {
        this.length = length;
    }
    public static void compareAirplanes() {
       if (length< Airplane2.length)
           System.out.println("Самолет 2 длиннее чем Самолет 1");
       else
           System.out.println("Самолет 1 длиннее чем Самолет 2");
    }
}
class Airplane2{
    public static int length;

    public int setLength(int length) {
        this.length = length;
        return length;
    }
}
