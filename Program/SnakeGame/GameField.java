package Program.SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener  {
    //Этот класс позволяет создать объект, который может быть использован в качестве иконки
    // для многих компонентов Swing. Интерфейс ActionListener отвечает за события, например
    // движение (метод move())
    private final int SIZE = 320; // Размер поля в пикселях
    private final int DOT_SIZE = 16; // Размер точки в пикселях
    private final int ALL_DOTS = 400; //Поскольку все поле 320, размер точки 16, соответственно
    //может поместиться 20 точек в длину и 20 в ширину, 20х20 = 400 пикселей игровых единиц
    //может поместиться на поле
    private Image dot;
    private Image apple;
    private int appleX; //Расположение яблока по Х координате
    private int appleY; //Расположение яблока по У координате
    private int[] x = new int[ALL_DOTS]; // Массив для положения змейки по х координате
    private int[] y = new int[ALL_DOTS]; // Массив для положения змейки по у координате
    private int dots; // Размер змейки в количестве объектов самой змейки (Изначально 3)
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField(){
        setBackground(Color.white); // Метод для установки цвета окна
        loadImages();
        InitGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true); // метод для соединения нажатия клавиш с игровым полем
    }
    public void InitGame(){
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
            
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();

    }
    public void createApple(){
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }
    public void loadImages(){
        ImageIcon iia = new ImageIcon("/Users/nikitaemelanov/IdeaProjects/Java/src/Program/SnakeGame/apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("/Users/nikitaemelanov/IdeaProjects/Java/src/Program/SnakeGame/dot.png");
        dot = iid.getImage();


    }

    @Override // Переопределение paintComponent для изменения положения яблок и точек на поле
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame){
            g.drawImage(apple,appleX,appleY,this);
            for (int i = 0; i < dots ; i++) {
                g.drawImage(dot,x[i],y[i],this);

            }
        }else {
            String str = "Game over";
            g.setColor(Color.black);
            g.drawString(str,125,SIZE/2);
        }
    }

    public void move(){ // Переопределение метода move интерфейса ActionListener
        for (int i = dots; i > 0 ; i--) {
            x[i] = x[i-1];
            y[i] = y [i-1];
        }
        if (left){
            x[0]-=DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up){
            y[0]-=DOT_SIZE;
        }
        if (down) {
            y[0] += DOT_SIZE;
        }
    }
    public void cheakApple(){ // Метод для проверки не встретили ли мы яблоко
        if (x[0] == appleX && y[0]==appleY){
            dots++;
            createApple();
        }
    }
    public void checkCollisions(){ // Метод проверки сталкивания змейки с границами игрового
        //поля или с самой с собой
        for (int i = dots; i > 0  ; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]){
                inGame = false;
            }
        }
        if(x[0]>SIZE){
            inGame = false;
        }
        if(x[0]<0){
            inGame = false;
        }
        if(y[0]>SIZE){
            inGame = false;
        }
        if(y[0]<0){
            inGame = false;
        }

    }

    @Override // Реализация интерфейса ActionListener
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            cheakApple();
            checkCollisions();
            move();

        }
        repaint();
    }
    class FieldKeyListener extends KeyAdapter{ // Класс интерфейса KeyListener для получения
        // событий с клавиатуры
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && !right){
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && !left){
                right = true;
                up = false;
                down = false;
            }

            if(key == KeyEvent.VK_UP && !down){
                right = false;
                up = true;
                left = false;
            }
            if(key == KeyEvent.VK_DOWN && !up){
                right = false;
                down = true;
                left = false;
            }
        }
    }
}
