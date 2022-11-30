package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Exzaple1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("zaur");
        arrayList1.add("ivan");
        arrayList1.add("maria");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("zaur");
        arrayList2.add("mike");
        List<String> arraylist3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4);
    }
}
