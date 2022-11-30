package lesson11;

import java.util.ArrayList;

public class Methods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zaur");
        arrayList.add("mike");
        arrayList.add("elena");
        System.out.println(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add("!!!");
        arrayList.add("???");
        arrayList.add("...");
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        //arrayList.clear();
        int index = arrayList.indexOf("mike");
        System.out.println(index);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("mike"));
    }
}
