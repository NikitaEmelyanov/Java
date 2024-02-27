package Les5_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Les5_HashMap {
    public static void main(String[] args) {
        //Урок 5: HashMap - Введение
        //Все методы интерфейса Map хранят пары ключ/значение
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один"); // Метод для добавления пары ключ/значение
        map.put(2, "Два");
        map.put(3, "Тройка");

        System.out.println(map);

        map.put(3, "Другое значение для ключа 3");
        System.out.println(map);
        //После добавления такого же ключа с другим значением ключ переписывается, так как
        //в Map не может быть дубликата ключей

        System.out.println( map.get(1)); // Метод для получения значения по ключу

        System.out.println( map.get(10));
        //При использовании get для несуществующей пары ключ/значение вернется null

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            //Каждая пара ключ/значение в Java это Entry. В Map пара ключ/значение не
            //рассматриваются отдельно, а рассматривается как структура данных. Чтобы
            //получить корректную работу цикла for параметризуем структура данных (Entry)
            // для целого числа и строки, далее присваиваем имя entry, далее используем
            //метод entrySet(), который возвращает все пары ключ/значение, который есть в
            //нашем Map. Далее с помощью метода getKey() получаем ключи всех структур
            //данных имеющихся в Map, а с помощью getValue() получаем значения
        }
    }
}
//Класс HashMap не гарантирует порядок вывода для пар ключ/значение, поскольку тут
// используется хеширование и зависит от случайных величин

