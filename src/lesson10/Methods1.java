package lesson10;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Methods1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("xaur");
        arrayList.add("mike");
        arrayList.add("iven");
        arrayList.add(1,"misha");
        for(String s : arrayList) {
            System.out.println(s);
        }

        for(int i = 0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.set(1, "masha");

        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
