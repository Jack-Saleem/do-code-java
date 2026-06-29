package pack1;

public class Pro8 {
    protected class Pa {
        void m1(){
            System.out.println("protected inner class");
        }
        protected int x = 20;
    }

    public static void main(String[] args) {
        Pro8 p = new Pro8();
        Pro8.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}