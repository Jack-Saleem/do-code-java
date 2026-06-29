package pack1;

public class Pro12 {
    protected class Pa {
        private void m1(){
            System.out.println("protected inner class");
        }
        protected int x = 20;
    }

    public static void main(String[] args) {
        Pro12 p = new Pro12();
        Pro12.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}