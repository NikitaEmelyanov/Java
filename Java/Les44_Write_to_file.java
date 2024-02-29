package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Les44_Write_to_file {
    public static void main(String[] args) throws FileNotFoundException {
        //Урок 44: Запись в файл.
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);
        //Класс PrintWriter - позволяет записывать в файл текстовую информацию

        pw.println("Test row 1");
        //Метод работает так же как и sout, в качестве аргумента передаем строку, которую нужно
        //записать в наш файл
        pw.println("Test row 2");

        pw.close();
        //После использования записи в файл необходимо закрыть метод, так же как и при сканировании
    }
}
