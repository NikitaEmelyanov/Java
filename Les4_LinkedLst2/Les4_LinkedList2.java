package Les4_LinkedLst2;

import java.util.LinkedList;
import java.util.List;

public class Les4_LinkedList2 {
    public static void main(String[] args) {
        //Урок 4: Связный список (LinkedList) - Как устроен
        List<Integer> list = new LinkedList<>();
        //У LinkedList есть два вида односвязный список и двусвязный список
        // LinkedList представляет собой не массив, как ArrayList а так называемые узлы
        //содержащие значения в себе. Первый элемент называется голова, а последний
        //называется хвост. Односвязный список представляет собой последовательность узлов
        //связанных ссылками, то есть у каждого узла есть ссылка на следующий узел. У
        //двусвязного есть ссылка и на следующий и на предыдущий узлы.
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);

        myLinkedList.remove(1);
        System.out.println(myLinkedList);



    }
}
