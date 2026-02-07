package docodejava.junior.operators;

public class RelationalO {
    public static void main(String[] args) {
        System.out.println("Is 10 > 20 ? " + (10 > 20)); //false
        System.out.println("Is 10.4 < 20 ? " + (10.4 < 20)); //true
        System.out.println("Is 'a' < 20 ? " + ('a' < 20)); //false a=97 (ASCII)
        System.out.println("Is 'a' > 'A' ? " + ('a' > 'A')); //true A=65, a=97 (ASCII)

//      Relational Operators is applicable to all the Primitive Data Types Except BOOLEAN.
//        System.out.println("Is true > false ? " + (true > false));

//        Nesting is not Supported by Relational Operators.
//        System.out.println(10 > 20 > 30);

    }
}
