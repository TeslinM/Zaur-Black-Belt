package lesson34;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("ok");
        al.add("uchim java");
        al.add("a imenno lambdas");
        al.removeIf(element -> element.length()<5);
        System.out.println(al);
    }
}
