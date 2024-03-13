package JavaPRO;

import java.util.Random;

public class Les28_Interrupting_threads {
    public static void main(String[] args) throws InterruptedException {
        // Урок 28: Прерывание потоков
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    //В Java можно большие числа разделять нижним подчеркиванием для удобства восприятия
                    if (Thread.currentThread().isInterrupted()) {
                        //Thread - класс, currentThread() - статический метод, который возвращает
                        // текущий поток, метод isInterrupted() возвращает true, если поток прерывался и
                        // вызывает false, если поток не прерывался
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread");

        thread.start();

        Thread.sleep(1000);
        thread.interrupt(); //Метод для прерывания работы потоков, при том он должен вызываться до
        // метода join(), поскольку после выполнения join() при очень долгом выполнении можно
        // не дождаться продолжения выполнения кода

        //InterruptedException выбрасывается в тех потоках, которые или прерываются или могут быть
        // прерваны с помощью interrupt()

        thread.join();


        System.out.println("Thread has finished");
    }
}
