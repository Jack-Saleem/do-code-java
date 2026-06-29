package test;

public class TypeCst {
    public static void main(String[] args) {
        //implicit type casting
    int a = 10;
    int b = 400;
    int c = 1234567891;
    int d = 'a';
    long e = 12345678901l;
    float f = 12345678901f;
    double g = 12345678901234567890d;
    System.out.println(a + "..." + b + "..." + c + "..." + d + "..." + e + "..." + f + "..." + g);

    //explicit type casting.
    int y = 200;
    byte z = (byte) y;
    int aa = 'a';
    char bb = (char) aa;
    float ff = 12.122112112121211f;
    int ii = (int) ff;
        System.out.println(y);
        System.out.println(z);
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(ff);
        System.out.println(ii);
}
}
