package docodejava.junior.operators;

import java.util.Scanner;

public class ConditionalO {
    public static void main(String[] args) {
        int a = 10;
        float b = 4.2f;
//        Conditional Statement.
       String x=(a < b)? "Statement is correct." : "Statement incorrect.";
        System.out.println(x);// Statement is incorrect.

        System.out.println();

//        Multiple Conditional Statements
        int y = (90 < 10) ? 'a' : ((10>20) ? 'b' : 'c');
        System.out.println ("The output will be printed in ASCII Values " + y);//99 [ASCII] value.

        System.out.println();

//        Program for checking the even and odd numbers.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur no to check Even or Odd: ");
        int n = sc.nextInt();
//        Conditional Expression.
        String c =(n < 1) ? n + " is a invalid number" : (n % 2 == 0) ?  n + " is a Even Number" : n + " is a Odd Number";
        System.out.println(c);
    }
}
