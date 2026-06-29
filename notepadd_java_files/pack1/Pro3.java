package pack1;

public class Pro3 {
    protected class Pa {
        public void m1(){
            System.out.println("protected inner class");
        }
       private int x = 20;
    }

    public static void main(String[] args) {
        Pro3 p = new Pro3();
        Pro3.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}