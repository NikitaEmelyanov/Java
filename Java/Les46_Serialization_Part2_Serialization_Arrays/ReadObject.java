package Java.Les46_Serialization_Part2_Serialization_Arrays;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        //Класс чтения объекта

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //Способ №1
            int personCount = ois.readInt();
            // С помощью метода readInt() мы считываем данные массива из файла people.bin и
            //помещаем их в переменную personCount
            Person[] people = new Person[personCount];
            //Далее в пустой массив помещаем считанную информацию, где personCount будет
            // длинной массива

            for (int i = 0;  i< personCount; i++){
                people [i] = (Person) ois.readObject();
                //Перебираем данные массива с помощью цикла for, где индекс должен быть меньше
                //длинны массива и считываем каждое значение с помощью метода readObject(),
                //используя Down casting от Object к Person
            }
            System.out.println(Arrays.toString(people));

            //Способ №2
//            Person [] people = (Person[]) ois.readObject();
//            System.out.println(Arrays.toString(people));
            // То же самое и с чтением из файла, при использовании чтения из файла опускаемся
            //ниже по иерархии наследования, используя down casting и получаем то же самое
            //легче и значимо сократив код



            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
// Разница в этих двух способах в том, что мы считали из файла 3 объекта отдельно
//(Способ №1) и считали один объект в виде массива (Способ №2)