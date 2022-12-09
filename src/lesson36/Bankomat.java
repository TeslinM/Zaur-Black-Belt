package lesson36;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("zaur", lock);
        new Employee("mike", lock);
        new Employee("oleg", lock);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee("ivan", lock);
        new Employee("elena", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name=name;
        this.lock=lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
//        System.out.println(name + " ждет... ");
//        lock.lock();
        System.out.println(name + " пользуется банкоматом");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
        }
        else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}