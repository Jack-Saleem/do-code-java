package docodejava.junior.operators;

import java.util.Scanner;

public class IncrementX {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int ip=sc.nextInt();

        if(ip == 0){
            ip++;
            System.out.println("The number becomes: " + ip);
        }
        else if (ip < 0){
            System.out.println("Negative numbers are not allowed!!! ");
        }
        else {
            System.out.println(ip);
        }

        int x = 10;
        System.out.println("Initial value of x = " + x); //10
//        Pre-Increment(++)
        System.out.println("Applying pre(++) to x: " + ++x); //11
        System.out.println("Value of x after ++x = " + x); //11
//        Post-Increment(++)
        System.out.println("Applying post(++) to x: " + x++); //11
        System.out.println("Value of x after x++ = " + x); //12

        int y = 40;
        System.out.println("The value of b is: " + y++); //40
        int z = y++;
        System.out.println("The value of z is: " + z); //41
        System.out.println("Value of y after the z is : " + y); //42

        int m= 5;
        System.out.println("Value of m is: " + m); //5
        System.out.println("Value of m after applying Pre-Inc:  " + ++m); //6

        int n=m;
        System.out.println("Value of n is: "+n); //6
        System.out.println("Value of n after Pre-Inc: "+ ++n); //7


    }
}
