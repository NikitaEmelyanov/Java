package Marathon.Day3;
/**
 * 3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое
 * и делитель. Для этих двух чисел программа рассчитывает результат деления и выводит его
 * в консоль. Если пользователь вводит 0 в качестве делителя, вместо того, чтобы
 * останавливать работу цикла принудительно, мы пропускаем итерацию и выводим в консоль
 * сообщение “Деление на 0”.
 * Ключевое слово else использовать в этой программе нельзя.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            i++;

            if (num2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(num1/num2);
        }
    }
}
