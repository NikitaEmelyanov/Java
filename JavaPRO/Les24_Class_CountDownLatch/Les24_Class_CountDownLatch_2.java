package JavaPRO.Les24_Class_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Les24_Class_CountDownLatch_2 {
    public static void main(String[] args) throws InterruptedException {
        //Урок 24: Класс CountDownLatch (Англ. защелка обратного отсчета)
        CountDownLatch countDownLatch = new CountDownLatch(3); // В качестве аргумента нужно указать
        // количество вызовов метода countDown()(декрементация переменной на 1)  из одного или из
        // разных потоков, чтобы "защелка" открылась с помощью метода await()

        // //Теперь наоборот, мы в методе main декрементировался на 1 CountDownLatch, а в трех потоках
        // ждали
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for ( int i = 0 ; i< 3; i++)
            executorService.submit(new Processor1(i,countDownLatch)); //Поручение новых заданий

        executorService.shutdown(); //Прекращение сабмита новых заданий

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();

        }
    }
}
class Processor1 implements Runnable{
    private int id;
    private CountDownLatch countDownLatch;
    public Processor1 (int id, CountDownLatch countDownLatch){
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id "+ id + " proceeded");
    }
}