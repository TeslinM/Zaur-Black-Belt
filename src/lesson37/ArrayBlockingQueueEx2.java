package lesson37;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        new Thread(() -> {
            int i = 0;
            while(true) {
                try {
                arrayBlockingQueue.put(++i);
                System.out.println("Продюсур добавил : " + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {

            while(true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer zabral : " + j);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
