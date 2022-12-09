package lesson36;

public class Ex12 {
    static final Car car = new Car();

    void mobileCall() {
        synchronized (car) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (car) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall() {
        synchronized (car) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable {
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImpSkype implements Runnable {
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImpWhatsapp implements Runnable {
    public void run() {
        new Ex12().whatsappCall();
    }
}

class Car {

}
