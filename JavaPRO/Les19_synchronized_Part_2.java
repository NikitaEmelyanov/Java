package JavaPRO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Les19_synchronized_Part_2 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
       // Урок 19: Ключевое слово synchronized (II часть)
        new Worker().main();
    }
}
class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();
    //Поскольку мы не хотим синхронизироваться на одном объекте, так как мы одновременно изменяем 2
    // объекта, мы можем выполнить работу методов на разных ядрах процессора одновременно, для этого
    // нужно создать объекты для синхронизации на них, и передать их в качестве аргумента, для этого
    // нужно использовать не ключевое слово synchronized, а конструкцию synchronized block

    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }
    public  void addToList2() {
            synchronized (lock2) {
                //Синхронизация происходит путем захвата так называемого монитора(механизм объекта)
                // объекта, у каждого объекта он свой, по этому если синхронизироваться на разных
                // объектах в разных потоках это вдвое может увеличить скорость работы программы и
                // исключается состояние гонки
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));
            }
        }
    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();

        }
    }
    public void main(){
        long before = System.currentTimeMillis(); // Текущее время в мс

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();

        System.out.println("Program took " + (after - before)+ "ms to run");

        System.out.println("list1 : " + list1.size());
        System.out.println("list2 : " + list2.size());
    }
}
