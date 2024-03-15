package JavaPRO;

import java.util.Arrays;

public class Les31_Regular_expressions_Part_2 {
    public static void main(String[] args) {
        //Урок 31: Регулярные выражения (часть II) Методы
        String a = "Hello.there.hey";
        String[] words = a.split("\\."); //Метод для разделения строки на отдельные слова, в
        // качестве аргумента нужно передать чем разделяются слова в строке (в данном случае точка)
        System.out.println(Arrays.toString(words));

        //Можно использовать регулярные выражения для разделения, например разделение по числам
        String b = "Hello24646there8764hey65748qweqwr";
        String[] words2 = b.split("\\d+");
        System.out.println(Arrays.toString(words2));

        String c = "Hello235423there23523523hey";
        String modifiedString = c.replaceAll("\\d+","-"); //Метод для замены
        // разделителя в строке, в качестве аргумента сначала приводится старый разделитель, в
        // качестве второго новый. replaceAll() позволяет использовать регулярные выражения, в то
        // время как replace() только строки
        String modifiedString2 = b.replaceFirst("\\d+","-");
        //Метод, который меняет только первый разделитель, не изменяя остальные
        System.out.println(modifiedString);
        System.out.println(modifiedString2);
    }
}
