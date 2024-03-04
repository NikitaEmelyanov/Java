package JavaPRO;

import java.util.Stack;

public class Les14_Stack {
    public static void main(String[] args) {
        //Урок 14: Стек (Stack)
        Stack<Integer> stack = new Stack<>();
        //Класс Stack это противоположность от Queue тот кто зашел последним, выйдет первым
        // (Last in / First out). Stack реализует класс Vector, который наследует все от интерфейса
        //List, но с появлением LinkedList Vector устарел и больше не используется
        stack.push(5); // Добавляет элемент в Stack
        stack.push(5);
        stack.push(1);

        System.out.println(stack.peek()); //Просмотр последнего элемента из Stack

        while (!stack.empty()) { // Возвращает true, если Stack пустой и возвращает false, если нет
            System.out.println(stack.pop()); // Удаляет последний элемент из Stack
        }





    }
}
