package lesson28;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("zaur");
        queue.add("mike");
        queue.add("tom");
        queue.add("oleg");
        queue.add("ivan");

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.element());
    }
}
