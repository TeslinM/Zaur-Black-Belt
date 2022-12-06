package lesson23;

import lesson22.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>();
        Student st1 = new Student("zaur", "tregulov", 3);
        Student st2 = new Student("ivan", "sodorov", 5);
        Student st3 = new Student("kolya", "ivanov", 1);
        Student st4 = new Student("mike", "balayan", 2);

        lhm.put(5.8, st1);
        lhm.put(6.3, st2);
        lhm.put(1.5, st3);
        lhm.put(9.9, st4);

        System.out.println(lhm.get(5.8));

        System.out.println(lhm);

    }
}
