package JavaPRO;

import java.util.Scanner;

public class Les22_Methods_wait_notify {
    public static void main(String[] args) throws InterruptedException {
        //Урок 22: Методы wait() и notify()
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");
            wait();
            //Методы wait() и notify() работает только в пределах синхронизованного блока и
            // вызывается всегда на ключевом слове this. Если нужно вызывать методы wait() и notify()
            // на другом объекте синхронизации, нужно вызвать метод на объекте через точку(.),
            // например object.wait().  Метод wait() отдает intrinsic lock
            // (монитор объекта) и ждет метода notify(). В качестве аргумента в wait() можно передать
            // количество миллисекунд, это будет время, которое wait() будет ждать notify(), если
            // аргумент не указан wait() будет ждать до тех пор пока не появится notify()
            System.out.println("Producer thread resumed...");
        }

    }
    public void consume() throws InterruptedException{
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify(); //Метод позволяет проснуться одному потоку, где был вызван метод wait() , так же
            // есть метод notifyAll() для прекращения ожидания всех потоков, где был вызван
            // метод wait(). ВАЖНО метод notify() не освобождает монитор

        }
    }
}