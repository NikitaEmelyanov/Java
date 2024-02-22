package Java.Les7_Input;

import java.util.Scanner;
//Добавление встроенного класса Scanner. Класс импортируется автоматически если ввести его название.

public class Les7_Input {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner - встроенный класс. scan - Название
        // new Scanner - выделение памяти из класса Scanner
        //(System.in) - параметр, позволяющий получать данные от пользователя
        //Конструкция представляет собой создание объекта, где с помощью встроенного класса мы создали объект,
        //выделили память в этом же объекте и использовали параметр, чтобы получать данные от пользователя.

        System.out.println("Введите ваше имя: ");
        String username = scan.nextLine();
        //Метод для получения от пользователя строки
        System.out.println("Привет, " + username);

        int num1 = scan.nextInt();
        //Метод для получения от пользователя числа
        byte num2 = scan.nextByte();
        boolean b = scan.hasNextBoolean();
        float num3 = scan.nextFloat();
        //Для каждого типа данных существует метод получения значения от пользователя с соответствующим названием,
        // но тип данных нужно указывать с заглавной буквы nextFloat, nextInt, nextBoolean и т.д.
    }
}