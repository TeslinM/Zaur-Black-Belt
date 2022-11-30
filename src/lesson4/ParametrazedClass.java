package lesson4;

public class ParametrazedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
    }
}

class Info <T> {
    private T value;
    public Info(T value) {
        this.value=value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
