import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=new int[5];

//        arr[0]=1;
//        arr[1]=32;
//        arr[2]=22;
//        arr[3]=202;
//        arr[4]=45;

        System.out.println(arr[4]);

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= in.nextInt();
        }

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i] + " ");
//        }

        //for each loop

        for (int j : arr) {  // for every element  in array print the element

            System.out.println(j + " ");
        }
    }
}
