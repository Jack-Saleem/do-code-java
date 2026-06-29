package pack1;

public class TestPb3 {
    void name() {
        System.out.println("I am name method");
        System.out.println(age);
    }

    int age = 20;

    public static void main(String[] args) {
        TestPb3 t = new TestPb3();
        t.name();
    }
}
