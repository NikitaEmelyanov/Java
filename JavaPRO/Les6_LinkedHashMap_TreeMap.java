package JavaPRO;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Les6_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        //Урок 6: LinkedHashMap и TreeMap

        //LinkedHashMap сохраняет порядок ввода новых пар ключ/значение в Map
        //TreeMap сортирует пары ключ/значение по ключу

        Map<Integer, String> hashMap = new HashMap<>();
        //Внутри не гарантируется никакого порядка
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        //В каком порядке пары ключ/значение были добавлены, в таком порядке они и вернуться
        Map<Integer,String> treeMap = new TreeMap<>();
        //Пары ключ/значение сортируются по ключу (Должен быть задан порядок сортировки).
        //В Java существует естественный порядок сортировки, например целые числа
        // сортируются по возрастанию, строки лексикографически
        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }
    public static void testMap (Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(12,"Mike");
        map.put(78,"Tom");
        map.put(0,"Tim");
        map.put(1500,"Lewis");
        map.put(7,"Bob");
        //В Map не может быть одинаковых ключей, но могут быть одинаковые значения

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}
