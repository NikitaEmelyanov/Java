package Marathon.Day3;
/**
 * 1. Реализовать программу, которая в консоль выводит название страны, принимая на вход
 * название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия Берлин, Мюнхен, Кёльн - Германия
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Для определения страны введите название города ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            String town = scanner.nextLine();
            if (town.equals("Stop")){
                System.out.println("Вы завершили работу программы");
                break;
            }else {

            while (true) {
                if (town.equals("Москва") || town.equals("Владивосток") || town.equals("Ростов")) {
                    System.out.println("Россия");
                    break;
                } else if (town.equals("Рим") || town.equals("Милан") || town.equals("Турин")) {
                    System.out.println("Италия");
                    break;
                } else if (town.equals("Ливерпуль") || town.equals("Манчестер") || town.equals("Лондон")) {
                    System.out.println("Англия");
                    break;
                } else if (town.equals("Берлин") || town.equals("Мюнхен") || town.equals("Кельн")) {
                    System.out.println("Германия");
                    break;
                } else {
                    System.out.println("Неизвестная страна");
                    break;
                }
            }
            }
        }
    }
}
