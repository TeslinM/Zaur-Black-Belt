package lesson25;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("zaur");
        set.add("igor");
        set.add("to");
        set.add("mike");
        set.add("mike");
        System.out.println(set);
        set.remove("zaur");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("misha"));

        for(String s : set) {
            System.out.println(s);
        }


    }
}
