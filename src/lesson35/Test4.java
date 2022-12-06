package lesson35;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

//        int result =  list.stream().reduce((accumulator, element) ->
//                accumulator*element).get();
//        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o =  list100.stream().reduce((accumulator, element) ->
                accumulator*element);
        if(o.isPresent()) {
            System.out.println(o);
        }
        else {
            System.out.println("Not present");
        }

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("net");
        list3.add("poka");
        list3.add("ok");

        String result3 = list3.stream().reduce((a,e) -> a+ " " + e).get();
        System.out.println(result3);
    }
}
