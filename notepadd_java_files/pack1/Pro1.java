package pack1;

public class Pro1 {
    protected class Pc {
        public void m1 () {
            System.out.println("I am a protected method");
        }
        public int x = 10;


    }
    public static void main(String[] args) {
        Pro1 p = new Pro1();
        Pro1.Pc q = p.new Pc();
        q.m1();
        System.out.println(q.x);

    }

}
