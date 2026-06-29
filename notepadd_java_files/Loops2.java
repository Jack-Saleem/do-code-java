package Loops;

//import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();

        for(int i = 1; i <= 5 ; i++ ){
            System.out.println();

            for(int j = 1; j <= 6 - i; j++){
                System.out.print(j + " ");
            }
        }
    }
}
