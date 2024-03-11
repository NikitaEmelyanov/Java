package JavaPRO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Les26_Class_Semaphore {
    public static void main(String[] args) throws InterruptedException {
        // Урок 26: Класс Семафор (Semaphore)

        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);
    //В качестве аргумента нужно указать количество разрешений для потоков
    private Connection(){
        //Конструкция с приватным конструктором используется для ограничения пользователя, то есть
        // пользователь не сможет создать объект этого класса. Такой патерн называется Singleton, то
        // есть во всей программе будет только один объект класса Connection и к этому объекту мы
        // будем обращаться из разных потоков
    }
    public static Connection getConnection(){
        return connection;
    }
    public void work() throws InterruptedException {
        semaphore.acquire();
        // Метод для начала взаимодействия с ресурсом, при том, если свободных разрешений нет
        // acquire() будет ждать пока хотя бы одно не освободиться
        try {
            doWork();
        } finally {
            semaphore.release();
            // Метод отдает разрешение использования потока, то есть данный метод нужно вызывать,
            // когда завершено использование ресурса

            //Так же существует метод, который возвращает количество свободных разрешений
            // - availablePermits()
        }
    }
    //Получается что, метод doWork() был обернут в метод work() с использованием переменной класса
    // Semaphore, а по скольку в качестве аргумента у этого класса количество разрешений для потока
    // (в данном случае 10) 200 потоков будут группироваться по 10 потоков, которые могут
    // одновременно записывать в Connection
    public void doWork() throws InterruptedException {
        synchronized (this){
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this){
            connectionsCount--;
        }
    }
}
