package Java.Les49_Recursion;

public class Factorial {
    public static void main(String[] args) {
        //Рекурсия очень полезна при просчете факториалов
        //Факториал это умножение чисел от большего к меньшему, например:
        //4! = 4 * 3 * 2 * 1
        //1! = 1
        //15! = 15 * 14 * 13 * 12 * .... * 2 * 1
        //0! = 1
        System.out.println( fac(4));
    }
    private static int fac (int n){
            if (n==1)
                return 1;
        return n * fac(n-1);
    }
}
