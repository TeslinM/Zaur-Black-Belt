package lesson35;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("ok");
        list.add("kak dela");
        list.add("poka");

//        for(int i = 0; i<list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5,9,2,6,3};
        array = Arrays.stream(array).map(element ->
        {
            if(element%3==0) {
        element = element/3;
        }
        return element;
        }).toArray();
        System.out.println(array);

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("ladno");
        set.add("ok");
        set.add("poka");

        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
