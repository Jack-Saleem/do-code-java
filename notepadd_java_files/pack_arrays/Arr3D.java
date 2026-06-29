package pack_arrays;

public class Arr3D {
    public static void main(String[] args) {
        int[][][] arr =
                {
                        {   //Layer - 0
                                {1,2,3}, //Row - 0(Layer - 0)
                                {4,5,6} //Row - 1(Layer - 0)
                        },
                        {   //Layer - 1
                                {7,8,9}, //Row - 0(Layer - 1)
                                {10,11,12} //Row - 1(Layer - 1)
                        }
                };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println();
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
    }
}
