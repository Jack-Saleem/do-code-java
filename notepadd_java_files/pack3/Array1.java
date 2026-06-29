package pack3;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            if(i==0)
                arr[i] =i + 1;
        else if(i%2 == 0)
            arr[i] = i + 1;
      //  arr[i] = arr[i] + (10 * i);
            System.out.print( arr[i] + " ");
        }
        System.out.println(arr[99]); // 990
        System.out.println(arr[0]); //
    }
}
