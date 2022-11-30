package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("inet");

        for(Object o : list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }
    }
}
