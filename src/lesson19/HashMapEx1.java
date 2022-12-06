package lesson19;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Rtegulov");
        map1.put(12, "Ivan Icanod");
        map1.put(222, "Nikolay Petrov");
        map1.put(1212, "Mike Teslin");
        map1.put(1000, "Oleg Tinkov");
        map1.put(null, "Sergey petrov");
        map1.putIfAbsent(652, null);
        System.out.println(map1);
        System.out.println(map1.get(1001));
        map1.remove(1212);
        System.out.println(map1);
        System.out.println(map1.containsValue("Oleg Tinkov"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("sasha", "dobriy");
        map2.put("mike", "clever");
        System.out.println(map2);
    }
}
