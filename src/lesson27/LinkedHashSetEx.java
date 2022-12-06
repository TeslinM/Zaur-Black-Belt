package lesson27;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(33);
        lhs.add(123);
        lhs.add(11);
        lhs.add(2);
        System.out.println(lhs);
    }
}
