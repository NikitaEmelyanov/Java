package Java.Les47_Serialization_Part3_Transient_serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        //Класс чтения объекта

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            //Такой код так же будет работать. Механика следующая: Создаем объект ois на основе
            //класса ObjectInputStream поставили к нему в конструктор класс FileInputStream,
            //использовали этот объект ниже. В качестве аргумента для конструктора ставим путь до
            //объекта или название объекта, если он в корневой папке. При таком синтаксисе поток
            //закрывать не нужно, так как он закрывается автоматически. Такой синтаксис, где try
            //реализуется в круглых скобках до catch называется try with resources.
            Person person1 =  (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
