package Java;

public class Les12_Arrays_of_Strings {
    public static void main(String[] args) {
        //Урок 12: Цикл for each, Массивы строк.
        int [] numbers = new int[5];
        numbers[0] = 10;
        String [] strings = new String[3];
        //Механика создания строчного массива такая  же как и с числами
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println();

        for (int i=0 ; i<strings.length ; i++){
            System.out.println(strings[i]);
            //В строчном массиве можно так же инициализировать переменные по индексу
            //самостоятельно, или использовать цикл for
        }
        System.out.println();

        for (String string: strings){
        // Цикл for each (each с анг. = для каждого)
        // В данной конструкции указывается тип данных String, название переменной string,
        //и через : указываем массив strings
        System.out.println(string);
    }
        int[] numbers2 = {1,2,3};
        int sum = 0;
        for (int x : numbers2){
            sum = sum + x;
            //Использование цикла for each для числового массива и суммирование всех элементов
        }
        System.out.println();
        System.out.println(sum);
}
}