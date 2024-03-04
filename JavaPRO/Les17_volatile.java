package JavaPRO;

import java.util.Scanner;

public class Les17_volatile {
    public static void main(String[] args) {
        //Урок 17: Многопоточность. Синхронизация потоков. Ключевое слово volatile
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread1.shotDown();

    }
}

class MyThread1 extends Thread{
    private volatile boolean running = true;
    // volatile гарантирует когерентность кешей, поскольку не будет кешироваться, а будет находиться
    //в главной памяти и каждый поток будет обращаться к главной памяти, чтобы получить актуальное
    //значение переменной. Если потоки делят какие-то общие данные в этих данных должно
    // использоваться ключевое слово volatile
    public void run(){
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
public void shotDown(){
        this.running = false;
}
}
//Логика следующая: запускается метод main, где запускается метод start() для класса MyThread1, где
//бесконечный цикл каждые 100 мс выдает на экран Hello, но при нажатии на Enter или ввести фразу и
//нажать Enter, сработает метод класса Scanner, который ждет строку от пользователя и после этого
//вызывается метод shotDown, который реализуется в таком же классе running перестает быть true и
//становиться false, соответственно условия для работы цикла становятся невыполнимы. Но может
// возникнуть проблема когерентности кешей, и второй будет все время перехватывать инициативу,
// поскольку цикл бесконечен и running не станет false, для этого и существует ключевое слово
// volatile, что говорит о том что переменная может быть изменена