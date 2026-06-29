package pack1;

public class Pro9 {
    protected class Pa {
       private void m1(){
            System.out.println("protected inner class");
        }
        private int x = 20;
    }

    public static void main(String[] args) {
        Pro9 p = new Pro9();
        Pro9.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}