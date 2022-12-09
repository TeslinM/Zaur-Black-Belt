package lesson37;

import java.util.concurrent.Semaphore;

public class SemaphoreEx1 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("zaur", callBox);
        new Person("elena", callBox);
        new Person("ivan", callBox);
        new Person("nariya", callBox);
        new Person("mike", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name= name;
        this.callBox=callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(3000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
        }
    }
}