package docodejava.junior.operators;

public class BitwiseO {
    public static void main(String[] args) {
//        & - Bitwise AND - Returns true only if both arguments true.
        System.out.println(true & false); //false
        System.out.println(true & true); //true
        System.out.println(false & false); //false
        System.out.println(false & false); //false

        System.out.println();

//        | - Bitwise OR - Returns true if any one argument is true
        System.out.println(true | false); //true
        System.out.println(true | true); //true
        System.out.println(false | false); //false
        System.out.println(false | true); //true

        System.out.println();

//        ^ - Bitwise XOR - returns true if both the arguments are different.
        System.out.println(true ^ false); //true
        System.out.println(true ^ true); //false
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

        System.out.println();

//        Bitwise operators also works with Integral Data Types but value is calculated Binary format
        System.out.println(3 & 4); //0 (by Binary calculation)
        System.out.println(4 | 5); //5 by Binary calculation)
        System.out.println(5 ^ 6); //3 by Binary calculation)

//      ! - Boolean complement operator give the opposite result everytime we use it.
//        Works only for Boolean types
        System.out.println(!true);




    }
}
