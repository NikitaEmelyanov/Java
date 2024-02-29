package Java;

import java.util.Scanner;

public class Les8_DoWhile {
    public static void main(String[] args) {
        //Урок 8: Цикл do...while.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 ");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("Введите 5 ");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");
        //Механика следующая, мы создаем переменную и присваиваем ей значение введенное
        //пользователем, перед этим пользователь получает сообщение "Введите 5", если
        //пользователь вводит другое значение, запускается цикл while, где value не равно
        //5, соответственно если вводится число 5 цикл while не выполняется.

        // Для избежания повторения кода, можно воспользоваться методом do while. Механика
        // do while заключается в том что, сначала выполняется цикл, а потом проверяются условия,
        // в то время как в while сначала должны быть выполнены условия для выполнения цикла.
        int num1;
        do {
            System.out.println("ВВедите 100");
            num1 = scanner.nextInt();

        } while(num1!=100);

        System.out.println("Вы введи 100 ");
    }
}
