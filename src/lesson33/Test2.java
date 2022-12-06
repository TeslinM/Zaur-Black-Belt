package lesson33;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str) -> {return str.length() + i;});
    }
}

interface I {
    int abc(String s);
}