package Marathon.Day2;
/**
 * 1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
 * число, соответствующее количеству этажей в здании. Используя условный оператор if,
 * необходимо вывести в консоль сообщение о типе такого дома.
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более -
 * “Многоэтажный дом”. Так же, необходимо учесть что может быть введено отрицательное
 *  значение, в таком случае сообщить “Ошибка ввода”.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Марафон день 2
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введите количество этажей в вашем доме");
        int floor = scanner.nextInt();
        if (floor < 4 && floor > 0){
            System.out.println("Малоэтажный дом");
        }else if (floor > 4 && floor < 9) {
            System.out.println("Среднеэтажный дом");
        }else if (floor > 9){
            System.out.println("Высокоэтажный дом");
        }else
            System.out.println("Ошибка ввода");
    }
}
