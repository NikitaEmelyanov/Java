package JavaPRO.Les27_Deadlock;

import java.util.Random;

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
    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            synchronized (account1){
                synchronized (account2){
                    Account.transfer(account1,account2, random.nextInt(100));
                    //Для избежания состояния гонки был обернут синхронизованный блок в другой
                    // синхронизованный блок с синхронизацией на разных объектах, это происходить потому
                    // что один поток завладевает двумя мониторами обоих объектов, а второй поток не
                    // получает доступ пока не освободятся мониторы

                    //Поскольку такая структура вложенности сильно ухудшает восприятие, данная структура
                    // не приветствуется в программировании и желательно реализовать такую синхронизацию
                    // с помощью Lock
                }
            }
        }
    }
    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            synchronized (account1){
                synchronized (account2){
                    Account.transfer(account2,account1, random.nextInt(100));
                }
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