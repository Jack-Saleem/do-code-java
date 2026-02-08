package docodejava.junior.operators;

public class TypeCasting_Imp {
    public static void main(String[] args) {
        float a = 10;
        System.out.println(a); //10.0
//      "float" can take the Data Type values of short, byte, int, char, long, but not boolean.
        System.out.println();


        int b = 'a';
        System.out.println(b); //97
//        int can take the char, byte and short values.
        System.out.println();

        double d ='b', x =10, y =10.4f, z =1092832l;
        System.out.println(d + " " + x + " " + y + " " + z);
//        Double can accept all the Primitive Data Types except the boolean.
    }
}
