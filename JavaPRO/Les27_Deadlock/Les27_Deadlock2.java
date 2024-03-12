package JavaPRO.Les27_Deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Les27_Deadlock2 {
    public static void main(String[] args) throws InterruptedException {
        //Урок 27: Взаимная блокировка (Deadlock)
        Runner1 runner = new Runner1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}
class Runner2 {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
private void takeLocks (Lock lock1, Lock lock2){
    boolean firstLockTaken = false;
    boolean secondLockTaken = false;

    while (true) {
        try {
            firstLockTaken = lock1.tryLock();
            secondLockTaken = lock2.tryLock();
        } finally {
            if (firstLockTaken && secondLockTaken) {
                return;
            }
            if (firstLockTaken) {
                lock1.unlock();
            }
            if (secondLockTaken) {
                lock2.unlock();
            }
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Механика следующая: Если оба лока не забираются одновременно, тот лок который начал
        // использоваться возвращается, после чего у другого потока появляется возможность
        // забрать лок с помощью сна sleep(). Поскольку цикл бесконечный, выход из цикла
        // осуществляется только если были забраны оба лока
    }
}
    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1,lock2);
            try{
                Account.transfer(account1,account2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
                //Реализация с помощью ReentrantLock с вынесением локов в отдельный метод
            }
        }
    }
    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2,lock1);
            // Если при ReentrantLock используется разный порядок использования локов в разных
            // потоках, может случиться Deadlock, это происходит из-за того, что оба потока
            // использовали lock(), и не могут передать монитор дальше так как мониторы разных
            // переменных использовались в разных потоках, что даст взаимную блокировку обоих
            // потоков
            //Способы избежания Deadlock
            //1) Не забирать мониторы в разных потоках в разном порядке
            //2) Использовать метод tryLock() класса Lock
            try{
                Account.transfer(account2,account1, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void finished(){
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance "+(account1.getBalance() + account2.getBalance()));
    }
}
class Account2 {
    private int balance = 10000;

    public void deposit (int amount){
        balance += amount;
    }
    public void withraw (int amount){
        balance -= amount;
    }
    public int getBalance (){
        return balance;
    }
    public static void transfer (Account acc1, Account acc2 , int amount){
        acc1.withraw(amount);
        acc2.deposit(amount);
    }
}