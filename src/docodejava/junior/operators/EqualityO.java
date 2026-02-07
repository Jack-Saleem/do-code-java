package docodejava.junior.operators;

public class EqualityO {
    public static void main(String[] args) {
        System.out.println(10 == 10); //true
        System.out.println('a' == 'a'); //true
        System.out.println(10 == 10.0); //true
        System.out.println('a' == 97); //true
        System.out.println('A' == 65.00); //true
        System.out.println("Sadik" == "Sadik.48"); //false
//
        Red r = new Red();
    String r1 = "Sadik";
    String r2 = "Sadik";
        System.out.println(r1 == r2); //true

        Thread t = new Thread();
        Object o = new Object();
        String s = new String("sadik");
        System.out.println(t == o); //false
        System.out.println(o == t); //false
        System.out.println(o == s); //false
//        System.out.println(t == s); Thread and String both are incomparable types.

        String s1 = new String("Sadik");
        String s2 = new String("Sadik");

//        Diff b/w (==) and .euals()
//        == Compares the address or the reference
        System.out.println(s1 == s2); //false both are pointing different references
//        .equals() Checks the content of the Object.
        System.out.println(s1.equals(s2)); //The content is same in s1 and s2

//        null == null is always returns true
        System.out.println(null == null);
    }
}
class Red {
}