package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Les39_Exceptions_Part3 {
    public static void main(String[] args) {
        //Урок 39: Исключения (часть 3). Checked и Unchecked исключения.

        //Checked Exception (Compile time exception) - это исключения возникающие во время
        // компиляции, так же эти исключения обязательно нужно обработать, иначе программа не
        //сможет быть скомпилирована. Checked Exception - это больше не ошибки, а исключительные
        //случаи в работе программы, поэтому Java обязывает разработчиков их обрабатывать

        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Что то не так !");
        }

        //Unchecked (Runtime exception) - это исключения, которые возникают во время выполнения
        //программ, самое частое это деление на 0. Unchecked exception - это ошибка в работе
        //программы, ее не нужно обрабатывать, а нужно просто убрать из программы или исправить
        int a = 1 / 0;
        System.out.println(a);

        String name = null; // null - это буквально ничего, по этому мы не можем использовать
        //методы или как то взаимодействовать с ничем
        name.length();
        System.out.println(name);

        int[] arr = new int[2];
        System.out.println(arr[2]); // тут мы просим вывести на экран число с индексом 2, но
        //у нас массив из двух чисел, а индексация их начинается с 0

        //Так же Runtime exception можно обрабатывать через try / catch, но в этом нет никакого
        //смысла, так как Unchecked exception являются ошибкой и их нужно или удалить из программы
        //или исправить для корректной работы
    }
}
