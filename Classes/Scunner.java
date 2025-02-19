package Classes;

import java.util.Scanner;
//Добавление встроенного класса Scanner. Класс импортируется автоматически если ввести его название.

/**
 * Класс Scanner
 */
public class Scunner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Класс Scanner

        // new Scanner - выделение памяти из класса Scanner
        //(System.in) - параметр, позволяющий получать данные от пользователя
        //Конструкция представляет собой создание объекта, где с помощью встроенного класса мы создали объект,
        //выделили память в этом же объекте и использовали параметр, чтобы получать данные от пользователя.

        System.out.println("Введите ваше имя: ");
        java.lang.String username = scan.nextLine();
        //Метод для получения от пользователя строки
        System.out.println("Привет, " + username);

        int num1 = scan.nextInt();
        //Метод для получения от пользователя числа
        byte num2 = scan.nextByte();
        boolean b = scan.hasNextBoolean();
        float num3 = scan.nextFloat();
        //Для каждого типа данных существует метод получения значения от пользователя с соответствующим названием,
        // но тип данных нужно указывать с заглавной буквы nextFloat, nextInt, nextBoolean и т.д.

        //Метод .hasNextLine возвращает true, если в файле есть еще не считанные строки и
        //возвращает false, если все строки считаны
        //Метод .split позволяет разделять слова через указанных аргумент (у нас указано пробел)
        //и образует из текста массив
    }
}