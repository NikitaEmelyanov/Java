package JavaPRO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Les3_LinkedLst {
    public static void main(String[] args) {
        //Урок3: Связный список (LinkedList) - Введение
        List <Integer> linkeList = new LinkedList<>();
        // При выборе класса LinkedList элементы внутри массива привязываются друг к другу,
        // что увеличивает скорость работы с массивом, если нужно добавлять, удалять ли
        // переиндексировать много элементов

        // Работают так же все методы как и в ArrayList .get(), .remove, .clear(),
        List arrayList = new ArrayList<>();

        measureTime(linkeList);
        measureTime(arrayList);
    }
    private static void measureTime (List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
            //Сначала мы замеряли время на создание объектов (этот цикл был между методами
            //считывающими время) LinkedList создал объекты за 121 мс, а ArrayList за 8 мс
        }

        long start = System.currentTimeMillis(); // Метод возвращающий время в миллисекундах

        for (int i = 0; i < 100000; i++) {
            list.get(i);
            // Теперь мы перебираем эти элементы с просмотром индекса через get(), у
            // Linked List 4338 мс, а у ArrayList 3 мс
            
        }
        long  end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
