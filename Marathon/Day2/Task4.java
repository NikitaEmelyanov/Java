package Marathon.Day2;
/**
 * 4. y = (x^2-10) / x+7, x>=5
 *    y = (x+3)(x^2-2)  ,-3<x<5
 *    y = 420           , Во всех остальных случаях
 *
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
 * Для этого числа, по формуле выше, необходимо вычислить значение y.
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у
 * Scanner’а соответственно, чтобы считать из консоли число x).
 * Пояснение.
 * Формула для вычисления y содержит две составляющие - набор выражений для вычисления
 * значения y и условие, при котором то или иное выражение “срабатывает”. Выполнение того или иного
 * условия зависит от значения x. Например, если x = 100, будет использовано самое первое выражение.
 * С помощью него, используя значение x будет вычислено значение y.
 * y = (100^2 - 10) / (100 + 7) = 93.3644859813
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        double x = scanner2.nextDouble();
        double y = 0;

        if (x>=5){
             y = (Math.pow(x,2)-10)/(x+7);
        } else if (x > -3 && x < 5) {
             y = (x+3)*(Math.pow(x,2) -2);
        } else  {
                y = 420;
        }
            System.out.println(y);
        }
    }

