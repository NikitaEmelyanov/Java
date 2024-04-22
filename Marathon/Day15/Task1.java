package Marathon.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv). Это пример
 * реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя
 * использован символ “;”). В этом файле содержится информация о названии модели обуви, ее размер и
 * оставшееся на складе количество.
 * До преобразования в csv это была таблица с тремя колонками:
 * Название
 * Ботинки HS РАН-Р 400 чер. ЗП 45 4 Ботинки PANDA САНИТАРИ 3916 S1 SRC бел. 37 1 ...
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и
 * размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте программу, которая
 * принимает на вход csv файл и создает новый txt файл следующего содержания
 * (должно получиться 11 строк):
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0 ...
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/nikitaemelanov/IdeaProjects/Java/src/Marathon/Day15/shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("/Users/nikitaemelanov/IdeaProjects/Java/src/Marathon/Day15/result.txt");
        PrintWriter pw = new PrintWriter(fileOut);
        while (scanner.hasNextLine()){
            String[] array = scanner.nextLine().split(";");
            if (Integer.parseInt(array[2])==0){
                pw.println(array[0]+ ", "+ array[1]+ ", "+ array[2]);
            }
        }
        pw.close();
        scanner.close();
    }
}
