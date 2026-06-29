package pack1;

public class Pro2 {
    protected class Pr {
        public void m1() {
            System.out.println("protected inner class");
        }

        int x = 20;
    }

    public static void main(String[] args) {
        Pro2 p = new Pro2();
        Pro2.Pr q = p.new Pr();
        q.m1();
        System.out.println(q.x);
    }
}