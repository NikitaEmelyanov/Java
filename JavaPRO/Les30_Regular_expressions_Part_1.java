package JavaPRO;

public class Les30_Regular_expressions_Part_1 {
    public static void main(String[] args) {
        //Урок 30: Регулярные выражения (часть I)
        //Регулярные выражения это хороший инструмент по работе с текстом, а так же позволяет это
        // язык который позволяет описать патерны в тексте

        /* Регулярные выражения, которые описывают группы строк
         \\d - одна цифра
         \\w - одна английская буква \\w=[a-zA-Z]

         + - 1 или более
         * - 0 или более
         ? - 0 или 1 символов до (то есть и для + и для -), при этом + не может быть перед числом
         ( x | y | z | w ) - одна строка из множества строк, где | - или

         [a-zA-z] - В квадратных скобках описываются все символы, которые могут встречаться,
          a-z - это перечисление от a до z и то же самое для заглавных букв [abc] = (a|b|c)
          [0-9] = \\d
          [^abc] - где ^ - отрицание символов, то есть будет true, если этих символов не будет в строке

          . - любой символ

          Точное количество до
          {2} - 2 символа до
          {2, } - 2 или более символов
          {2,4} - от2 до 4 символов
         */

        String a = "-1234";
        String b = "12412";
        String c = "+2414";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));
        // Метод сравнивает строку которая, приходит в качестве аргумента со строкой на которой
        // вызывается, и возвращает true, если строки совпадают и false, если нет

        String d = "gsd3333ifygdF111BUI124125";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e ="asdf";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandecs.ru";
        String url3 = "Hello there!";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "12342343";
        System.out.println(f.matches("\\{d2,}"));
    }
}
