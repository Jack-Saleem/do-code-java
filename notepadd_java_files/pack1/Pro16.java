package pack1;

public class Pro16 {
    protected class Pa {
        protected void m1(){
            System.out.println("protected inner class");
        }
        private int x = 20;
    }

    public static void main(String[] args) {
        Pro16 p = new Pro16();
        Pro16.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}