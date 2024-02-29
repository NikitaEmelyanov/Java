package Java;

public class Les3_Strings {
    public static void main(String[] args) {
        //Урок 3: Строки(String) в Java. Ссылочные типы данных.
        short num1 = 7;
        String user_name = "Bob " ;
        // String - переменная для ввода строки. "Текст вписывается в кавычках"
        // String пишется с заглавной буквы, так как String является классом, а классы
        //в Java пишутся с заглавной буквы
        String space = "likes ";
        String compani = "Alkaida ";
        System.out.println(user_name + num1);
        System.out.println(user_name + space + compani);
        System.out.println("Hello " + "World " + "!");
        //Можно объединять как строки между собой, так и слова внутри println через +
        //Так же можно объединять строки с примитивными типами данных

    }
}
