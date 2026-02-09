package docodejava.junior.operators;

import java.util.Scanner;

public class NewO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r1= new Random();
        System.out.print("Enter the name of the Junior: ");
        r1.name = sc.nextLine();
        Random r2= new Random();
        System.out.print("Enter the name of the Senior: ");
        r2.name = sc.nextLine();
        System.out.println(r1.name + " is Junior."); // <name> is Junior.
        System.out.println(r2.name + " is Senior."); // <name> is Senior.

    }
}
class Random{
    String name;
}
