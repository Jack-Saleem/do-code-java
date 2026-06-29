package pack1;

public class Pro5 {
    protected class Pa {
        void m1(){
            System.out.println("protected inner class");
        }
        int x = 20;
    }

    public static void main(String[] args) {
        Pro5 p = new Pro5();
        Pro5.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}