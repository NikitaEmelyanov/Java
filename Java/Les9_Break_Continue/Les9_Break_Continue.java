package Java.Les9_Break_Continue;

public class Les9_Break_Continue {
    public static void main(String[] args) {
        //Урок 9: Операторы break и continue
        int i = 0;
        while (true){
            if (i==15){
                break;
                // Оператор break для выхода из цикла
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла ");

        for (int i2 = 0; i2<=15;i2++){
            if (i2%2==0){
                continue;
                //continue - оператор для пропуска одной итерации (одного круга цикла),
                // при выполнении условий
            }
            System.out.println("Это не четное число "+ i2);
        }
    }

}
