package Les4_LinkedLst_Implementation;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;
    public void add(int value){

        if (head==null) { // Если это первое добавление
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value)); //То есть последнему значению присваивается
            //новое значение
        }
        size++;
    }

    public int get (int index){ // Реализация метода get
        int currentIndex = 0;
        Node temp = head;


        while (temp !=null){
            if (currentIndex == index){
                return temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove (int index){ // Реализация метода remove
        if (index == 0 ) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null){
            if (currentIndex  == index - 1) {
                temp.setNext(temp.getNext().getNext());
                //То есть мы элементу удаления назначаем другой узел, с помощью двойного
                //getNext(). таким образом мы указываем следующий узел для узла удаления.
                //То есть для элемента удаления мы указываем следующий узел (так как у него
                //есть ссылка на тот узел который за ним) и указываем соответственно узел
                //который идет после него так как нам нужно сослаться на него минуя
                // предыдущий
                size--;
                //После удаления элемента должен измениться размер листа
                return;

            }else {
                temp = temp.getNext();
                currentIndex++;
            }
            // Поскольку связный список имеет механику, что у каждого элемента есть ссылка
            //на следующий элемент, нужно дойти до того элемента, который находится перед тем
            //который нужно удалить, что предыдущий элемент мог сослаться на элемент после
            //удаленного
        }
    }

    public String toString(){ //Переопределение метода toString
        int[] result = new int[size];

        int idx = 0;
        Node temp =head;

        while (temp != null){
            result [idx++] = temp.getValue();
            //такой синтаксис эквивалентен [idx] и дополнительной строчке idx++;
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
