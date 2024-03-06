package JavaPRO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Les20_Thread_pool {
    public static void main(String[] args) throws InterruptedException {
        //Урок 20: Пул потоков (Thread pool)
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //Класс Executors содержит статические методы, это методы принимают на вход какие-то
        // аргументы и возвращает ExecutorService. В данном случае метод newFixedThreadPool
        // принимает в качестве аргументов количество потоков, в итоге ExecutorService (англ. сервис
        // по выполнению является пулом из двух потоков (поскольку в аргументе для
        // newFixedThreadPool - 2)
        for (int i = 0; i < 5; i++)
            executorService.submit(new Work(i));
            //В метод submit нужно поставить объект класса реализующий интерфейс Runnable, поскольку
            // в методе run() прописывается логика выполнения в потоке, так же в классе Work
            // присваивается id, которое присваивается счетчику i. Метод позволяет принимать задания

            executorService.shutdown(); // Метод для прекращения передачи заданий
            System.out.println("All task submitted");

            executorService.awaitTermination(1, TimeUnit.DAYS); //(Англ. - ожидание окончания)
            //То есть если через указанное время задания не выполнятся, программа пойдет дальше по коду

    }
}
class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work" + id + " was completed");
    }
}
