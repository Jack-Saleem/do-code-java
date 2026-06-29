package number_based_loops;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int product = 1;
        for(int i = 1; i<= a; i++){
            product = product * i;
        }
        System.out.print(product);
    }
}
