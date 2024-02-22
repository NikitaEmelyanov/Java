package Java.Les4_WhileLoops;

public class Les4_WhileLoops {
    public static void main(String[] args) {
        //Урок 4: Цикл while.
        int value = 0;
        while (value<5){
            System.out.println("Hello" + value);
            value = value +1;
            // цикл while включает в себя одно условие, и не выполнит цикл если условие
            // не верное, то есть while выполняется только когда принимает значение true
        }

    }
}
