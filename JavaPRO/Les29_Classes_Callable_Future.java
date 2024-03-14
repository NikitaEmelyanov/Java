package JavaPRO;

import java.util.Random;
import java.util.concurrent.*;

public class Les29_Classes_Callable_Future {
    public static void main(String[] args) {
        //Урок 29: Callable и Future
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            //Поскольку интерфейс Runnable реализует метод public void run() то мы ничего не можем
            // вернуть, но если использовать параметризованный интерфейс Callable, то мы сможем
            // вернуть значение, в данном случае Integer. При использовании лямбда выражений код
            // будет выглядеть одинаково, но Java сама понимает какой интерфейс, реализуется
            // Runnable или Callable, поскольку в первом нельзя вернуть ничего, а во втором можно
            // вернуть значение

            //Future(Будущее) так же параметризованный интерфейс, который может принимать в себя
            // значения из Callable. С помощью параметра мы можем указать какой тип значений будет
            // передан в переменную класса Future в дальнейшем (после выполнения потока)
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                  e.printStackTrace();
                }
                System.out.println("Finished");

                Random random = new Random();
                int randomValue = random.nextInt();

                if (randomValue<5)
                    throw new Exception("Something bad happend");

             return random.nextInt(10);
            }
        });

        executorService.shutdown();

        try {
            int result = future.get(); // get() дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause(); //Метод для получения причины исключения
            System.out.println(ex.getMessage()); // Метод выводит текст исключения
            //Так же с помощью интерфейсов Callable и Future появляется возможность выбрасывать
            // исключения и взаимодействовать с ними
        }
    }
}
