package pack_arrays;

public class ArrForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int x : arr){
           System.out.println(x);
            x = 100;
        }
        System.out.println(arr[0]);
    }
}
