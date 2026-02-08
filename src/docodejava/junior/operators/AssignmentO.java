package docodejava.junior.operators;

public class AssignmentO {
    public static void main(String[] args) {
//        3 - types.
//        1 - Simple Assignment Operators
        int x = 10;
        char a = 'a';
        float f = 1.45f;
        System.out.println(x + " " + a + " " + f);//10 a 1.45
        System.out.println();
        int ab = 9999;
        int bc = ab;
        int cd = bc;
        System.out.println("After Swaping using Assignment operator: " + cd); //9999

        System.out.println();

//        2 - Chained Assignment Operators
        int m,n,o;
        int l=m=n=o=30;
        System.out.println(l+"..."+m+"..."+n+"..."+o+"...");

        System.out.println();

//        3 - Compound Assignment Operators
        int A = 60;
        A += 40;
        System.out.println("After applying addition with assignment: " + A);//100
        A -= 50;
        System.out.println("After applying Minus with assignment: " + A);//50
        A /= 2;
        System.out.println("After applying division with assignment: " + A);//25
        A %= 5;
        System.out.println("After applying modulus with assignment: " + A);//0

        System.out.println();

        byte b = 50;
        b +=10;
        System.out.println("This byte b returns implicit type casting: " + b);//60
    }
}
