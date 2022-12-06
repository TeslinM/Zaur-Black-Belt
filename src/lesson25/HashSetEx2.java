package lesson25;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashset1 = new HashSet<>();
        hashset1.add(5);
        hashset1.add(3);
        hashset1.add(1);
        hashset1.add(7);
        hashset1.add(10);
        hashset1.add(2);

        HashSet<Integer> hashset2= new HashSet<>();
        hashset2.add(1);
        hashset2.add(99);
        hashset2.add(354);
        hashset2.add(73);
        hashset2.add(1011);
        hashset2.add(2111);

        HashSet<Integer> union= new HashSet<>(hashset1);
        union.addAll(hashset2);
        System.out.println(union);


    }
}
