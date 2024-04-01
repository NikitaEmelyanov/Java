package Classes;

import java.util.Random;
//Для использования данного класса его нужно импортировать

public class Random1 {
    public static void main(String[] args) {
        //Класс Рандом

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(6)+ 1);
        //Есть методы для получения псевдослучайного значения каждого типа данных, в качестве
            // аргумента можно передать параметр, например при nextInt(10) максимальное значение
            // псевдослучайного целого числа будет 9

        }
    }
}
