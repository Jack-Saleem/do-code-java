package pack1;

public class TestPb1 {
    void name() {
        System.out.println("I am name method");
        System.out.println(age);
    }

    public int age = 20;

    public static void main(String[] args) {
        TestPb1 t = new TestPb1();
        t.name();
    }
}
