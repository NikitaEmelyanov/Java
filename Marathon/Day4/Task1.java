package Marathon.Day4;
/**
 * 1. С клавиатуры вводится число n- размер массива. Необходимо создать массив указанного
 *  размера и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива
 * в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Marathon.Day4.Day4
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));

        System.out.println("Длинна массива: " + array.length);

        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>8)
                counter8++;
        }
        System.out.println("Количество чисел больше 8: " +counter8);

        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1)
                counter1++;
        }
        System.out.println("Количество чисел равных 1: " + counter1);

        int counterCH = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2==0)
                counterCH++;
        }
        System.out.println("Количество четных чисел: " +counterCH);

        int counterN = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2!=0)
                counterN++;
        }
        System.out.println("Количество нечетных чисел: " +counterN);

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println("Сумма всех чисел: " +sum);
    }

}