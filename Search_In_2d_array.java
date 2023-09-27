import java.lang.reflect.Array;

public class Search_In_2d_array {
    public static void main(String[] args) {
        int[][] arr = {{11, 21, 23},
                {3, 54, 23},
                {25, 26, 66}};

        int target=26;
        int[] ans=search_in2darray(target , arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search_in2darray(int target, int[][] arr)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
             if(arr[row][col]==target)
                 return new int[]{row,col};

            }
        }
     return new int[]{-1,-1};
    }

}

