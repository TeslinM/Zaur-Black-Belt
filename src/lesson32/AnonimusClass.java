package lesson32;

public class AnonimusClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(m.doOperation(3,6));
    }
}

interface Math {
    int doOperation(int a, int b);
}
