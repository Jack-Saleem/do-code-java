package pack_arrays;

public class Arr2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6,7,8}};
        System.out.println(arr[1][4]);
        int sum = 0;
       for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[i].length; j++){
                //System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
           System.out.println("Sum = " + sum);
        }
       /*  for(int[] x : arr){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println();
        }*/
        }
    }

