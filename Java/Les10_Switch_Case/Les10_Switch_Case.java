package Java.Les10_Switch_Case;

import java.util.Scanner;

public class Les10_Switch_Case {
    public static void main(String[] args) {
        // Урок 10: Оператор switch-case
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число ");
        int num = scanner.nextInt();
        switch (num){
            // В данном операторе мы можем присваивать действие каждому случаю (кейсу), например если пользователь
            //введет 1,2,5 или 10 он получит вывод на экран предусмотренный кейсом, а если другое число, то
            // ни одно условие кейсов не будет выполнено сработает default
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                //  default аналог else в условной конструкции switch-case
                System.out.println("Default");
                break;
            // break; не обязательно для ввода при default в любом случае будет корректное отображение
        }
        //С помощью оператора switch можно перебирать не только числовые переменные, но и строковые

        System.out.println("Введите возраст словом");
        Scanner scanner2 = new Scanner(System.in);
        String age = scanner2.nextLine();
        switch (age){
            case "Ноль" :
                System.out.println("Ты родился");
                break;
            case "Семь" :
                System.out.println("Ты пошел в школу");
                break;
            case "Восемнадцать" :
                System.out.println("Ты закончил школу ");
                break;
        }
    }
}
