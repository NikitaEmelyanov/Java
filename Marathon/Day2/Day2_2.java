package Marathon.Day2;

import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();
        int b = scanner2.nextInt();
        for (a = 0; a < b; a++) {
            if (a>0){
                a = a + 5;
            }
        }
    }
}
