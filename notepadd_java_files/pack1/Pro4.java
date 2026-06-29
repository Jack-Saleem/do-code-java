package pack1;

public class Pro4 {
    protected class Pa {
        public void m1(){
            System.out.println("protected inner class");
        }
        protected int x = 20;
    }

    public static void main(String[] args) {
        Pro4 p = new Pro4();
        Pro4.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}