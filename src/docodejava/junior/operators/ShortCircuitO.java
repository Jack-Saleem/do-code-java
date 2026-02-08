package docodejava.junior.operators;

public class ShortCircuitO {
    public static void main(String[] args) {
        int x = 10, y = 20;

//        Executes both conditions irrespective of other.
        if(++x <10 & ++y>20){ //(11 < 10) - false & (21 > 20) - true ==> false & true = false.
            x++; //x =11, y = 21
        }
        else {
            y++; //y = 22,  else block executes.
        }
        System.out.print(x + " "); //x = 11
        System.out.println(y); //y = 22

//        Executes both conditions irrespective.
        if(++x <10 | ++y>20){ //(12 < 10) - false & (23 > 20) - true ==> false & true = true.
            x++; //x = 13, y =23
        }
        else {
            y++; //if block executes.
        }
        System.out.print(x + " "); //x = 13
        System.out.println(y); //y = 23.

//    The condition y is only executed when x is true otherwise jumps to else block.
        if(++x <10 && ++y>20){ //(14 < 10) - false, jumps to the else block.
            x++;
        }
        else {
            y++;//23++ =24, else block executes.
        }
        System.out.print(x + " "); //x = 14
        System.out.println(y); //y = 24

//    The condition y is only executed when x is false otherwise jumps to else block.
        if(++x <10 || ++y>20){ //(15 < 10) - false, moves to y, (25 > 20) - True.
            x++; //x = 16, if block executes
        }
        else {
            y++;
        }
        System.out.print(x + " "); //x = 16
        System.out.println(y); // y = 25
    }
}
