import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives

        int[] arr=new int[5];
        System.out.println("Input for arrays");

//        arr[0]=1;
//        arr[1]=32;
//        arr[2]=22;
//        arr[3]=202;
//        arr[4]=45;

        //System.out.println(arr[4]);

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= in.nextInt();
        }

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i] + " ");
//        }

        //for each loop

//        for (int j : arr) {
//            System.out.println(j + " ");
//        }

        //Arrays.toString(pass array)

        System.out.println(Arrays.toString(arr));



// array of objects

        // input for string

        System.out.println("Input for string");

        String[] str = new String[5];
        for(int i=0;i<str.length;i++)
        {
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));

        }
    }




