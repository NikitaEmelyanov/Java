package Marathon.Day3;

import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {

        //3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое
        // и делитель. Для этих двух чисел программа рассчитывает результат деления и выводит его
        // в консоль. Если пользователь вводит 0 в качестве делителя, вместо того, чтобы
        // останавливать работу цикла принудительно, мы пропускаем итерацию и выводим в консоль
        // сообщение “Деление на 0”.
        //Ключевое слово else использовать в этой программе нельзя.

        for (double i = 0; i < 5; i++) {
            System.out.println("Введите число 1");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            System.out.println("Введите число 2");
            double num2 = scanner.nextDouble();
            switch (scanner){
                case (num2 !=0) :
                   double result =  num1 / num2;
                    System.out.println(result);
                case (num2 ==0 ) :
                    System.out.println("Деление на 0 ");
                    continue;
                default:
            }
        }
    }
}
