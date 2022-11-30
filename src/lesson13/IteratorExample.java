package lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zaur");
        arrayList.add("mike");
        arrayList.add("kolya");
        arrayList.add("tom");
        arrayList.add("ken");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(arrayList);
    }
}
