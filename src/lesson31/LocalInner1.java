package lesson31;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int chastnoe() {
                return delimoe/delitel;
            }

            public int getOstatok() {
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("delimoe = " + delenie.getDelimoe());
        System.out.println("delitel = " + delenie.getDelitel());
        System.out.println("chastnoe = " + delenie.chastnoe());
        System.out.println("ostatok = " + delenie.getOstatok());
    }
}
