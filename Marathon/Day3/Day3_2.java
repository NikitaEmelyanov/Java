package Marathon.Day3;

import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args) {

        //2. Реализовать программу, которая пока работает, принимает на вход от пользователя два
        // числа - делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
        // и выводит его в консоль. Программа останавливает свою работу тогда, когда пользователь
        // вводит 0 в качестве делителя. (для этих вещественных чисел необходимо использовать
        // тип double и метод nextDouble() у Scanner’а соответственно).

        for (int i = 0; i < 1000; i++) {
            System.out.println("Введите число 1");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            System.out.println("Введите число 2");
            double num2 = scanner.nextDouble();
            if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.println("Результат: " + result);

                } else if (num2 == 0) {
                break;
            }
            }
        }
    }
