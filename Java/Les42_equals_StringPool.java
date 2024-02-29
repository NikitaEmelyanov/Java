package Java;

import Java.Les41_Abstract_classes.Animal;

public class Les42_equals_StringPool {
    public static void main(String[] args) {
        //Урок 42: Метод equals() и String Pool.
        int x = 1;
        int y = 1;
        System.out.println(x==y);
        //Так можно сравнивать только примитивные типы данных

        Animal animal1 = new Animal (1);
        Animal animal2 = new Animal (1);
        System.out.println(animal1==animal2);
        //Для сравнения ссылочных типов данных при использовании == будет false, так как это
        //будет не корректное сравнение
        System.out.println(animal1.equals(animal2));
        // Для корректного сравнения используем метод .equals(),
        //но его нужно переопределить, чтобы сравнивать объекты структурно, если этого не
        //сделать так же получим false

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
        //Поскольку класс String - это тоже ссылочный тип данных, по этому так же нужно
        //сравнивать через метод equals для корректного сравнения
        System.out.println(string1==string2);
        //Поскольку в классе String Java выделяет память под "Hello" для string1 и потом при
        //создании объекта string2  с тем же "Hello" он уже не выделяет новую память, а
        // ссылается на первое выделение памяти, поэтому string1==string2 будет отображаться
        //так же корректно, такое понятие называется String Pool
        String string3 = new String("Hello");
        String string4 = new String("Hello");
        System.out.println(string3 == string4);
        //Но если выделить память для
        //каждого объекта отдельно, String Pool не сработает, так как под каждый объект будет
        //выделена новая часть памяти, по этому лучше использовать equals
        String a = "hello";
        String b = "hello123".substring(0,5);
        //Метод .substring() позволяет отсечь несколько элементов (числа в аргументе метода
        //0 - начало, 5 конец, то есть hello123 будет отображаться с начала и по 5 символ
        System.out.println(a==b);
        // Получается что переменные a и b содержат одинаковые строки, но при сравнении с
        //помощью ==, компилятор так же возвращает false

    }
    static class Animal{
        private int id;
        public Animal (int id){
            this.id = id;
        }
        public boolean equals (Object  obj){
            Animal otherAnimal = (Animal ) obj;
            //Используем Downcastind для переопределения метода. Так же для переопределения
            // метода нужно полностью повторить сигнатуру метода, для того чтобы узнать
            //сигнатуру метода нужно нажать Command+U

            return this.id == otherAnimal.id;
        }
    }
}
