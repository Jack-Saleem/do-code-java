package pack1;

public class Example {
    protected int a = 10;
    protected void m1(){
        System.out.println("I am a protected method");
    }
    public static void main(String[] args) {
        Pro13 p = new Pro13();
        Pro13.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}
