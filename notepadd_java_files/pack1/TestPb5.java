package pack1;

public class TestPb5 {
    private void name() {
        System.out.println("I am name method");
        System.out.println(age);
    }

     int age = 20;

    public static void main(String[] args) {
        TestPb5 t = new TestPb5();
        t.name();
    }
}
