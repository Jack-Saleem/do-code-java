package test;

public class AssignmentOp {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = b = c = d = e = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //compound assignment operators
        int aa = 10;
        aa += 10;
        aa -= 5;
        aa /= 3;
        aa *= 10;
        aa %= 5;
        System.out.println(aa);
    }


}
