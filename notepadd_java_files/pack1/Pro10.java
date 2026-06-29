package pack1;

public class Pro10 {
    protected class Pa {
        private void m1(){
            System.out.println("protected inner class");
        }
       int x = 20;
    }

    public static void main(String[] args) {
        Pro10 p = new Pro10();
        Pro10.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}