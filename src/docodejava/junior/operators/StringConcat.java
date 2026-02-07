package docodejava.junior.operators;

public class StringConcat {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        If the Argument starts with a String then it Concatenates the corresponding other variables Data Types irrespective of.
        System.out.println("Adding String before Variables " + a + b ); //Adding string before 1020
//        To avoid Concatenation place the String at the last.
        System.out.println(a + b + " Adding String after Variables"); // 30 Adding String after Variables
        System.out.println(a + " Adding String in the middle of Variables " + b); // 10 Adding String in the middle of Variables 20

        String x = " Sadik ";
        int y = 48;
        double z = 1.69;
        System.out.println(x + y + z); // Sadik 481.69
        System.out.println(y + x + z); // 48 Sadik 1.69
        System.out.println(y + z + x); // 49.69 Sadik

    }
}
