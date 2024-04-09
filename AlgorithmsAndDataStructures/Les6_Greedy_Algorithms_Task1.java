package AlgorithmsAndDataStructures;

import java.util.Arrays;
import java.util.Collections;

/**
 * Урок 6. Жадные алгоритмы. Реализация алгоритма (часть 1)
 */

public class Les6_Greedy_Algorithms_Task1 {
    public static void main(String[] args) {
        int[] digits ={3,1,7,9,9,5};
        System.out.println(maxNumbersFromDigits(digits));

        System.out.println(maxNumbersFromDigits2(digits));
    }
    public static String maxNumbersFromDigits (int [] digits){
        //O(n*log(n))
        //O(n)
        //O(n*log(n)) - конечная сложность, если она устраивает, приступаем к реализации.
        // Если нет, то нужно подумать как можно еще реализовать алгоритм снизив его сложность
        Arrays.sort(digits);
        String result = "";
        for (int i = digits.length -1; i >=0 ; i--)
            result += digits[i];
        //Несмотря на то, что мы отдалились от условий реализации жадного алгоритма, он по-прежнему
        // остается жадным, так как на каждой итерации цикла используется самая большая цифра из
        // исходного массива
        return result;
        }
        //В Java8+ можно реализовывать проще и короче
    public static String maxNumbersFromDigits2 (int[] digits2){
        return String.join("",Arrays.stream(digits2).boxed().sorted(Collections.
                reverseOrder()).map(String::valueOf).toArray(String[]::new));
        // Для упрощения нужно перевести массив в String и использовать Лямбда выражение
        // boxed() - метод для оборачивания массив примитивов в класс обертку
        //Далее через метод sorted(), где в качестве аргумента установлен компаратор
        // Collections.reverseOrder(), который сортирует элементы в обратном порядке. После чего
        // вызывается метод map(String::valueOf), чтобы перевести числа в строки, после вызывается
        // метод toArray(String[]::new) чтобы перевести поток в массив. После всех этих итераций
        // вызывается (в самом начале) метод String.join() чтобы объединить все это в одну строку
    }
    }

