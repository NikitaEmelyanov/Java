package Java.Les45_Serialization_Part1;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        //Класс чтения объекта
        //В проекте может быть сколько угодно методов main, так как может быть сколько угодно
        //точек входа в программу

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Механика такая же как и при записи в файл, только в обратной последовательности

            Person person1 = (Person) ois.readObject();
            //Исключение ClassNotFoundException говорит о том, что при передаче файла people.bin
            // может не оказаться класса Person, по этому используем Down casting для избежания
            //ошибки и корректной обработки исключения
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
            //После так же всегда закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
