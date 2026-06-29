package pack1;

public class Pro15 {
    protected class Pa {
        protected void m1(){
            System.out.println("protected inner class");
        }
        int x = 20;
    }

    public static void main(String[] args) {
        Pro15 p = new Pro15();
        Pro15.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}