package Program.SnakeGame;

import javax.swing.*;

public class MainWindow extends JFrame {
    //Библиотека JFrame позволяет создавать и работать с окнами
    public MainWindow(){
        setTitle("Змейка"); // Метод для ввода названия окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Метод прекращения работы
        //программы при закрытии окна
        setSize(320,345); // Метод для указания размера окна (на мак поле с
        // названием тоже входит в размер окна и занимает примерно 25 пикселей)
        setLocation(400,400); // Метод указывающий на расположение окна, относительно
        //верхнего левого угла в пикселях
        add(new GameField()); // Метод добавляющий игровое поле в данное окно
        setVisible(true); // Метод делающий окно видимым
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
