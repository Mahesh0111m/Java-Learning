import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//syntax for two dimensional array
// datatype[][] variable_name = new datatype[rows_size][columns_size];

        //  int[][] nums = new int[3][];

        //column size is optional

//other synatx

//       int[][] arr = {
//               {1,2,3},
//               {4,5,6},
//               {7,8,9}
//       };

        // arr.length gives number of rows

        int[][] arr = new int[3][3];

        System.out.println("Taking input for 2d array");

        for (int row = 0; row < arr.length; row++) {
            //for each col in every reow
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }

        for (int row = 0; row < arr.length; row++) {
            //for each col in every reow
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();


        }

        // we can also print using arrays.tostring()

        System.out.println("printing using arrays.tostring()");

        for (int row = 0; row < arr.length; row++){
            //row 1d array we just passed array
            // for 2d array we pass arr[row] as each row is separate array.
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}
