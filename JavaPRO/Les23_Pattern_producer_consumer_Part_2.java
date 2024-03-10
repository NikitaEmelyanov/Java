package JavaPRO;

import java.util.LinkedList;
import java.util.Queue;

public class Les23_Pattern_producer_consumer_Part_2 {
    public static void main(String[] args) throws InterruptedException {
        //Урок 23: Паттерн producer - consumer (II часть)
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e){
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
class ProducerConsumer {
    private Queue queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException{
        int value = 0;
        while (true){
            synchronized (lock){
                while (queue.size()==LIMIT){
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }
    public void consume() throws InterruptedException{
        while (true){
            synchronized (lock){
                while (queue.size()==0){
                    //Можно использовать цикл if, но вызывается while для того чтобы точно понимать,
                    // что размер очереди не равен нулю, while крутится до того момента, пока условия
                    // выполняются
                    lock.wait();
                }

               int value = (int) queue.poll();
                System.out.println(value);
                System.out.println("Queue size is "+queue.size());
                lock.notify();
                //Лучше всего вызывать метод notify() в конце синхронизованного блока, так как
                // notify() не возвращает монитор
            }
            Thread.sleep(1000);
        }
    }
}
// Нужно отметить, что wait() и notify() не потокобезопасны, поскольку это достаточно низкий уровень