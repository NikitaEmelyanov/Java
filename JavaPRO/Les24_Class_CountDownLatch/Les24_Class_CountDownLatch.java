package JavaPRO.Les24_Class_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Les24_Class_CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        //Урок 24: Класс CountDownLatch (Англ. защелка обратного отсчета)
        CountDownLatch countDownLatch = new CountDownLatch(3); // В качестве аргумента нужно указать
        // количество вызовов метода countDown()(декрементация переменной на 1)  из одного или из
        // разных потоков, чтобы "защелка" открылась с помощью метода await()

        //В данном случае мы в методе main ждали CountDownLatch, а в трех потоках CountDownLatch
        // декрементировался на 1
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for ( int i = 0 ; i< 3; i++)
            executorService.submit(new Processor(countDownLatch)); //Поручение новых заданий

        executorService.shutdown(); //Прекращение сабмита новых заданий

        countDownLatch.await(); // Метод ждущий, пока выполнится нужное количество итераций метода
        // countDown(), чтобы продолжить работы программы (открыть "защелку")
        System.out.println("Latch has been opened, main thread is proceeding!");

    }
}
class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    public Processor (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown(); // Метод countDown() декрементирует переменную на 1
    }
}