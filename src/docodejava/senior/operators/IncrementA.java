package docodejava.senior.operators;

public class IncrementA {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a: " + a); // 10
        System.out.println("Value of ++a: " + ++a); // 11
        System.out.println("Value of a after ++a: " + a); // 11
        System.out.println("Value of a++: " + a++); // 11
        System.out.println("Value of a after a++: " + a); // 12
        int b = 20;
        System.out.println("Value of b++: " + b++); // 20
        int c = b++;
        System.out.println("Value of c after b++: " + c); // 21
        System.out.println("Value of b after b++: " + b); // 22
        int d = 30;
        System.out.println("Value of ++d: " + ++d); // 31
        int e = ++d;
        System.out.println("Value of e after ++d: " + e); // 32
        System.out.println("Value of d after ++d: " + d); // 32

    }
}
