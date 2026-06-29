package pack1;

public class TestPb2 {
    public void name() {
        System.out.println("I am name method");
        System.out.println(age);
    }

    int age = 20;

    public static void main(String[] args) {
        TestPb2 t = new TestPb2();
        t.name();
    }
}
