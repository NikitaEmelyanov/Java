package JavaPRO.Les33_Lambda_Part_1;

public class Les33_Lambda_Part_1 {
    public static void main(String[] args) {
        //Урок 33: Лямбда - выражения (часть I)
        Thread thread = new Thread(() -> System.out.println("Hello"));
        //Любой интерфейс с одним методом может быть реализован с помощью лямбды выражения, то есть
        // можно не писать код с реализацией анонимного класса, а использовать лямбда выражений, что
        // значительно сокращает код и облегчает восприятие. Лямбда выражение это анонимная функция
        // (метод без названия)
    }
}
