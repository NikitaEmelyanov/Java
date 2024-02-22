package Java.Les45_Serialization_Part1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Класс записи объекта
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2,"Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            // Класс FileOutputStream позволяет записать в файл объекты (вернее сказать
            // последовательность байтов объекта), в качестве аргумента указываем название файла.
            // Расширение файла может быть любым или и вовсе файл может не иметь расширения, но
            // обычно при записи бинарной информации в файл используется расширение .bin
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Класс ObjectOutputStream уже как раз для записи объекта в файл, но для корректной
            //реализации ему нужна последовательность байтов из FileOutputStream в качестве
            // аргумента (объект fos созданный на основе FileOutputStream)


            oos.writeObject(person1);
            oos.writeObject(person2);
            //Теперь можно использовать объект oos и с  помощью метода writeObject можно записать
            //наши объекты person1 и person2 в файл
            oos.close();
            //После использования выходного потока данных обязательно нужно его закрыть, иначе
            //ничего в файл не запишется
        } catch (IOException e){
            e.printStackTrace();
        }

        //После обрабатывает исключение через try / catch и прописываем сценарий, если такого
        //файла не будет



    }
}
