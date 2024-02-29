package Java;

import java.util.Scanner;

public class Les6_if_else {
    public static void main(String[] args) {
        //Урок 6: Условные конструкции if / else / else if
        int a = 15, b = 20;
        char sim1 = 'A', sim2 = 'A';
        boolean isHasCar = true;
        if (isHasCar && a == b && sim1 != sim2) {
            // При использовании boolean isHasCar == true, а !isHasCar == false, то есть isHasCar сокращение от isHasCar == true
            // && оператор соединения для того чтобы оба соединенных условия выполнялись (Оператор И)
            // || Оператор соединения для того чтобы хотя бы одно из условий выполнялось (Оператор ИЛИ)
            System.out.println("Да, Верно");
        } else if (a >= b) {
            // Оператор else if может быть использован только после if и пред else
            System.out.println("Second test");
        } else if (a > b) {
            System.out.println("3 test");
        } else if (a <= b) {
            System.out.println("4 test");
        } else if (a == b) {
            //Возможные команды для использования if, else if, else на примере a и b:
            //a==b - a равно b, при том правильно вводить ==, так как при вводе = мы присвоим значение a
            //a!=b - a не равно b
            //a>=b - a больше или равно b
            //a<=b - a меньше или равно b
            //a>b - a больше b
            //a<b - a меньше b
            System.out.println("5 test");
        } else {
            //не обязательный оператор, если его не использовать то если предыдущие условия не выполнены, то ничего не будет выводиться на экран
            System.out.println("Нет, не верно");

        }
        Scanner Scanner = new Scanner(System.in);
        // При вводе класса, например Scanner происходит автоматическое импортирование данного класса
        System.out.print("Введите роль: ");
        String role = Scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = Scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345")) {
            // Для проверки именно строки нужно добавить .equals ("Текст проверки") после названия проверяемой переменной,
            // то есть, если пользователь вводит роль Admin и пароль 12345, выводится на экран Все пользователи,
            //если нет то выводиться Привет, как вас зовут ?
            System.out.println("Все Пользователи");
        } else {
            System.out.println("Привет, как вас зовут ?");
            String name = Scanner.nextLine();
        }
    }
}
