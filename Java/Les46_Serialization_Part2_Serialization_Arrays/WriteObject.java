package Java.Les46_Serialization_Part2_Serialization_Arrays;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Класс записи объекта
        Person[] people = {new Person(1,"Bob"),
                new Person(2,"Mike"), new Person(3,"Tom") };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Для записи массива в файл существует 2 способа.

            //Способ №1
            oos.writeInt(people.length);
            //Сначала записывает целое число с помощью метода writeInt и указываем длинну
            //массива с помощью .length
            for (Person person : people){
                oos.writeObject(person);
                //Затем с помощью цикла for each проходимся по всем объектам класса Person в
                //массиве people и записываем каждый элемент массива с помощью writeObject в
                //переменную person
            }
            //Способ №2
            // oos.writeObject(people);
            //Поскольку массив это тоже объект, намного проще использовать запись объекта
            //тогда использование цикла и все с ним связанное не нужно
            oos.close();

        } catch (IOException e){
            e.printStackTrace();
        }
        // Разница в этих двух способах в том, что мы записали в файл 3 объекта отдельно
        //(Способ №1) и записали один объект в виде массива (Способ №2)
    }
}
