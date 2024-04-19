package Marathon.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Honda");
        list.add("Mazda");
        list.add("Mercedes");
        list.add("Toyota");

        System.out.println(Arrays.toString(new List[]{list}));

        list.remove(0);
        list.add(2,"Voyah");

        System.out.println(Arrays.toString(new List[]{list}));

    }
}
