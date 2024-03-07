package JavaPRO;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Les21_Pattern_producer_consumer_Part_1 {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    //BlockingQueue потокобезопасная очередь, то есть мы можем обращаться к ней в нескольких
    // потоках и имеет предельный размер (указывается в аргументе) и ведет себя по особенному
    // если очередь заполнена или пуста
    public static void main(String[] args) throws InterruptedException {
        //Урок 21: Паттерн producer - consumer (Англ. производитель - потребитель) (I часть)

        //Производитель - это множество пользователей, который дает задачи
        //Потребитель - потоки, которые решают эти задачи и дают ответ пользователю
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
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
    private static void produce() throws InterruptedException {
        Random random = new Random();
        while (true){
            queue.put(random.nextInt(100)); //Метод добавляет элементы в очередь, но ждет пока она
            // освободится, если она заполнилась
        }
    }
    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(100);

            if (random.nextInt(10) == 5) {
                System.out.println(queue.take()); // Метод позволяет брать из очереди элемент и
                // ждать если в очереди нет элементов
                System.out.println("Queue size is " + queue.size());
            }
        }
    }
}
//Механика следующая, первый поток Производитель (Produce) быстро набрал себе 10 псевдослучайных
// чисел (от 0 до 99) через метод put (поскольку размер очереди 10), после заполнения очереди
// остался ждать пока потребитель (consumer) достанет элемент с помощью take() из очереди, после
// чего дает информацию пользователю. Затем put() добавляет новый элемент и так далее до
// бесконечности, так как у нас бесконечный цикл