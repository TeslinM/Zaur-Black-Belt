package lesson37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolsEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for(int i = 0; i<10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200() );
//        }
        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}