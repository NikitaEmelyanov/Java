package Marathon.Day2;
/**
 * 3. Реализовать программу No2, используя цикл while.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();
        int b = scanner2.nextInt();
        while (a<b){
            a++;
            if (a %5 ==0 && a%10 !=0){
                System.out.println(a);
            }else if (a >= b) {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
