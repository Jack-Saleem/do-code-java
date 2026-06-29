package pack1;

public class Pro14 {
    protected class Pa {
        protected void m1(){
            System.out.println("protected inner class");
        }
        public int x = 20;
    }

    public static void main(String[] args) {
        Pro14 p = new Pro14();
        Pro14.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}