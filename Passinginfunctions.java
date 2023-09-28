import java.util.Arrays;

public class Passinginfunctions {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        //changing the values of array
        //using reference
        arr[1]=101;
        arr[2]=833;
        arr[4]=493;



    }
}
