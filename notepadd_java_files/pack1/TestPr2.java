package pack1;

public class TestPr2 {
    public static class Pr2 {
        public void name() {
            System.out.println("I am name method");
            System.out.println(age);
        }

        public int age = 20;
    }
    public static void main(String[] args) {
        Pr2 t = new Pr2();
        t.name();
    }
}
