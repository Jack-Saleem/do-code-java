package pack1;

public class Pro7 {
    protected class Pa {
        void m1(){
            System.out.println("protected inner class");
        }
        private int x = 20;
    }

    public static void main(String[] args) {
        Pro7 p = new Pro7();
        Pro7.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}