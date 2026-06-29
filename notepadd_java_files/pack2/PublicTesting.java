package pack2;
import pack1.*;
public class PublicTesting {
    public static void main(String[] args) {
        PublicTest t = new PublicTest();
        t.name();
        System.out.println(t.age);
        TestPb1 p  = new TestPb1();
        TestPb4 b = new TestPb4();
    }
}