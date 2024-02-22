package Java.Les36_ReadiingFromFile;

import java.io.File;
// В пакете .io находится большинство классов для ввода и вывода данных
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Les36_ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        //Урок 36: Чтение из файла.

        // На MacOc и Windows по разному выглядят разделители пути, на MacOs - /, а на Windows \
        // Для того чтобы программа была универсальной мы используем .separator и java сам
        //определит какой должен быть разделитель
        String path = separator + "Users" + separator+ "nikitaemelanov"+ separator + "ideaProjects" + separator + "java"+ separator + "test.txt";
        //Теперь не важно Windows это или MacOC, если файл будет находиться в том же месте, все
        //будет работать.
        //Была проблема пока текст был в формате rtf и в пути файла не было указано .txt
        File file= new File(path);
        // File - стандартный класс для ввода данных, где в (аргументе) нужно указать путь до файла

        Scanner scanner = new Scanner(file);
        //Классу сканер не важно откуда считывать информацию из входного потока или из файла,
        //поэтому указываем в качестве аргумента наш файл file
        String input = scanner.nextLine();
        while(scanner.hasNextLine()) {
            //Метод .hasNextLine возвращает true, если в файле есть еще не считанные строки и
            //возвращает false, если все строки считаны
            System.out.println(scanner.nextLine());
        }

        // Так же возможно не указывать полный путь до файла, если поместить файл в корневую папку проекта

        File file2= new File("123.txt");
        // Если файл находится в корневой папке проекта, то можно указать только название файла
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String [] numbersString = line.split(" ");
        //Метод .split позволяет разделять слова через указанных аргумент (у нас указано пробел)
        //и образует из текста массив
        int [] numbers = new int[3];
       int counter = 0;

        for(String number : numbersString ){
           numbers [counter++] =  Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbersString));
        //Для вывода массива на экран нужно использовать метод .toString, иначе корректная работа не
        //будет выполняться так как массив это объект

        scanner2.close();
        //После использования нужно закрыть сканер чтобы поток не оставался открытым и не
        //занимать ресурсы

    }
}
