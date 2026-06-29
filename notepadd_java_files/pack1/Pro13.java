package pack1;

public class Pro13 {
    protected class Pa {
        protected void m1(){
            System.out.println("protected inner class");
        }
        protected int x = 20;
    }

    public static void main(String[] args) {
        Pro13 p = new Pro13();
        Pro13.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}