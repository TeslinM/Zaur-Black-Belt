package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(4.14);
        list1.add(5.14);
        list1.add(6.14);

        List<String> list2 = new ArrayList<>();
        list2.add("oj");
        list2.add("poka");
        list2.add("privet");
    }

    static void showListInfo(List<?> list) {
        System.out.println("elementi lista " + list);
    }
}
