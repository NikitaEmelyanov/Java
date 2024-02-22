package Java.Les38_Exceptions_Part2;

import java.io.IOException;
import java.util.Scanner;

public class Les38_Exceptions_Part2 {
    public static void main(String[] args) throws ScannerExceptions {
        //Урок 38: Исключения (часть 2). Выбрасывание исключений.

        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if (x!=0){
               throw new ScannerExceptions("Вы ввели что то кроме нуля");
                }
                //throw new - метод для выбрасывания исключений. Поскольку Exception класс
                // родитель для всех исключений можно выбрать подходящее исключение из списка
                //наследников (Всех исключений) или на сайте oracle.com
                //Механика следующая, мы просим пользователя ввести число и если это не ноль
                //то выбрасывается исключение IOException(), которое можно либо обработать, либо
                //выбрать обработку по умолчанию
            }
        }
    }

