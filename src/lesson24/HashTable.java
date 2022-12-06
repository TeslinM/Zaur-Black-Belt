package lesson24;

import lesson22.Student;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("zaur", "tregulov", 3);
        Student st2 = new Student("ivan", "sodorov", 5);
        Student st3 = new Student("kolya", "ivanov", 1);
        Student st4 = new Student("mike", "balayan", 2);
        hashtable.put(5.8, st1);
        hashtable.put(6.3, st2);
        hashtable.put(1.5, st3);
        hashtable.put(9.9, st4);
        System.out.println(hashtable);
    }
}
