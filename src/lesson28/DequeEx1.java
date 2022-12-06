package lesson28;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.addLast(1);
        deque.addFirst(99);
        deque.addFirst(123);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
