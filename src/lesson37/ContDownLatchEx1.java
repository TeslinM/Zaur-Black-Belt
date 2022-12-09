package lesson37;

import java.util.concurrent.CountDownLatch;

public class ContDownLatchEx1 {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLanch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let,s open market");
        countDownLatch.countDown();
        System.out.println("countDownLanch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLanch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("zaur", countDownLatch);
        new Friend("oleg", countDownLatch);
        new Friend("mike", countDownLatch);
        new Friend("kesha", countDownLatch);
        new Friend("elena", countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch=countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}