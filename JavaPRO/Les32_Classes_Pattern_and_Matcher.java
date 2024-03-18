package JavaPRO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les32_Classes_Pattern_and_Matcher {
    public static void main(String[] args) {
        //Урок 32: Классы Pattern и Matcher
        String text = "Hello, Guys! I send you my email joe@gmail.com so me can\n" +
                "keep in touch.Thanks, Joe! That's cool. I am sending you\n"+
                "my address: tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("(\\w+)@(yandex|gmail)\\.(com|ru) ");
        //На основе класса паттерн нельзя создавать новый объект, так как в документации класса
        // прописан приватный конструктор, поэтому Pattern email = new Pattern недопустимый синтаксис.
        // Но есть возможность создавать объекты с помощью статического метода compile(),
        // который возвращает новый объект класса Pattern, в качестве аргумента нужно передать то,
        // что нужно искать в тексте
        // Такой патерн программирования называется Factory Method и заключается в том, что мы
        // ограничиваем пользователя на создание объектов через конструктор, но взамен дается метод,
        // который при изменении переменной присваивается в новую переменную
        Matcher matcher = email.matcher(text); //Механика создания объектов класса Matcher такая же
        //Сам класс Matcher предназначен для работы с объектами класса Pattern
        while (matcher.find()){
            //Метод find() ищет совпадения в тексте
            System.out.println(matcher.group()); // Метод group() без аргументов получает то, что
            // нашел find() или в качестве аргумента указать число, которое обозначает id группы
            // (любая строка, которая находится в круглых скобках), например в нашем случае
            // id (yandex|gmail) = 2, нумерация id начинается с 1
            //Если имеются вложенности распределение id осуществляется так:
            /*
            1   2   3        1 - внешняя группа                      1
            ()  ()  ()     2   3 - вложенные группы слева направо    2     3
                         (()   ())                                 (( ))  ( )
             */
        }
    }
}
