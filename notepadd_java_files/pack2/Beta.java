package pack2;

public class Beta implements Alpha{
    public void m1(){
        System.out.println("i am a method from Alpha & implemented in Beta");
    }

    public static void main(String[] args) {
        Beta b = new Beta();
        b.m1();
    }
}
