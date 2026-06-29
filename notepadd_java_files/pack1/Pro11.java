package pack1;

public class Pro11 {
    protected class Pa {
        private void m1(){
            System.out.println("protected inner class");
        }
        public int x = 20;
    }

    public static void main(String[] args) {
        Pro11 p = new Pro11();
        Pro11.Pa q = p.new Pa();
        q.m1();
        System.out.println(q.x);
    }
}