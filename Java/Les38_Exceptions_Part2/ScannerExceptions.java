package Java.Les38_Exceptions_Part2;

import java.util.Scanner;

public class ScannerExceptions extends Exception{
    //Создание исключения на основе работы класса Scanner
    //Сначала мы наследуем все от класса Exception (класс родитель для всех исключений)
    public  ScannerExceptions (String description){
        super(description);
        //Таки образом мы переопределили конструктор класса Exception (поскольку в классе
        // Exception есть конструктор с аргументом в виде строки) и теперь можем использовать
        // наше исключение, где в качестве аргумента будет строка
    }
}
