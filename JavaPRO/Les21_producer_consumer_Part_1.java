package JavaPRO;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Les21_producer_consumer_Part_1 {
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    //BlockingQueue потокобезопасная очередь, то есть мы можем обращаться к ней в нескольких
    // потоках и имеет предельный размер (указывается в аргументе) и ведет себя по особенному
    // если очередь заполнена или пуста
    public static void main(String[] args) {
        //Урок 21: Паттерн producer - consumer (Англ. производитель - потребитель) (I часть)

        //Производитель - это множество пользователей, который дает задачи
        //Потребитель - потоки, которые решают эти задачи и дают ответ пользователю
    }
    private static void produce(){
        Random random = new Random(100);
        while (true){

        }

    }
}
