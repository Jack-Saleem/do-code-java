package pack1;

public class Pro6 {
    protected class Pa {
      void m1(){
            System.out.println("protected inner class");
        }
        public int x = 20;
    }

    public static void main(String[] args) {
        Pro6 p = new Pro6();
        Pro6.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}