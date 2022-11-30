package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Methods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zaur");
        arrayList.add("mike");
        arrayList.add("tom");
        arrayList.add("shon");
        arrayList.add("elena");
        System.out.println("ArrayList = " + arrayList);


        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2);


        //Object[] array = arrayList.toArray();
        //String[] array2 = arrayList.toArray(new String[5]);

        //for(String s : array2) {
          //  System.out.println(s);
        //}

        //List<String> myList = arrayList.subList(1, 4);
        //System.out.println(myList);
        //myList.add("fedor");
        //System.out.println(myList);
        //System.out.println(arrayList);
        //arrayList.add("sveta");
        //System.out.println(arrayList);

        //ArrayList<String> arrayList2 = new ArrayList<>();
        //arrayList2.add("mike");
        //arrayList2.add("tom");
        //arrayList2.add("igor");
        //System.out.println(arrayList2);

        //arrayList.retainAll(arrayList2);
        //System.out.println(arrayList);
        //boolean result = arrayList.containsAll(arrayList2);
        //System.out.println(result);
    }
}
