package Java.Les47_Serialization_Part3_Transient_serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Класс записи объекта
        Person person1 = new Person(1,"Mike");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            // Желательно использовать такой синтаксис, чтобы поток закрывался автоматически и
            //чтобы не думать об этом, так же это значительно сокращает код
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
