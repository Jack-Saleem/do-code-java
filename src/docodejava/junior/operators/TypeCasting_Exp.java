package docodejava.junior.operators;

public class TypeCasting_Exp {
    public static void main(String[] args) {
        int x = 200;
//        byte b = x;
        byte b = (byte) x;
//        Explicitly telling the compiler to take the x in byte, but in this there's always a chance of miss information
        System.out.println("The output is not 200 it is " + b); //-56

        System.out.println();

        double d = 156.78609;
        int i = (int) d;
//        int removes the decimal points when executed, information will not be accurate.
        System.out.println("Int removes the decimal points " + i); //156
    }
}
