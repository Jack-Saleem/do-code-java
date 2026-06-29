package Loops;

public class Loops17 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + 4 + " ");
            }
            System.out.println();
        }
    }
}


/*
5
5 6
5 6 7
5 6 7 8
5 6 7 8 9
 */
