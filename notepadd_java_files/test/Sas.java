package test;
public class Sas {
    int a;
    static int b;
    public static void main(String[] args) {
        int x = 10;
        int y = 010;
        int z = 0x10;
        int a;
        System.out.println(x + "..." + y + "..." + z);
        Sas s = new Sas();
        System.out.println(s.a);
        System.out.println(s.b);
    }
}