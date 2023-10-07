import java.util.Arrays;

public class Search_in_2d_Arrays {
    public static void main(String[] args) {
        int[][] arr={
                {13,21,44},
                {55,36,4,2,11},
                {95,67},
                {54,73,88,60,80}
        };
        int target= 13;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target) {
                    return new int[] {row,col };

                }

            }
        }
        return new int[]{-1,-1};
    }
}
