package pack1;

public class TestPb4 {
    void name() {
        System.out.println("I am name method");
        System.out.println(age);
    }

    private int age = 20;

    public static void main(String[] args) {
        TestPb4 t = new TestPb4();
        t.name();
    }
}
