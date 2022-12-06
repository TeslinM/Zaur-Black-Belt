package lesson22;

import com.sun.security.jgss.GSSUtil;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("zaur", "tregulov", 3);
        Student st2 = new Student("ivan", "sodorov", 5);
        Student st3 = new Student("kolya", "ivanov", 1);
        Student st4 = new Student("mike", "balayan", 2);
        Student st5 = new Student("tom", "shmatov", 3);
        Student st6 = new Student("shon", "galkin", 2);
        Student st7 = new Student("alesya", "teslina", 4);
        treeMap.put(5.8, st1);
        treeMap.put(6.3, st2);
        treeMap.put(1.5, st3);
        treeMap.put(9.9, st4);
        treeMap.put(5.6, st5);
        treeMap.put(6.5, st6);
        treeMap.put(7.8, st7);

        //System.out.println(treeMap);
        //System.out.println(treeMap.headMap(7.3));
        //System.out.println(treeMap.lastEntry());
        //System.out.println(treeMap.firstEntry());
        //System.out.println(treeMap.get(9.9));
        //treeMap.remove(5.8);
        //System.out.println(treeMap);
        //System.out.println(treeMap.descendingMap());

    }
}

