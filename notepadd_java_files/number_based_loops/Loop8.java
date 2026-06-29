    package number_based_loops;

    public class Loop8 {
        public static void main(String[] args) {
            int n = 12564628;
            int count = 0;
           for(;n > 0;){
               n = n / 10;
               count++;

           }
            System.out.print(count);
        }
    }
