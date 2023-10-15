//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// As it is infinite array there is no out of bound here.
public class Infinite_array {
    public static void main(String[] args) {

        int[] arr={1,2,3,23,33,55,443,376,978,564,222,546};
        int target=2;

        int answer = ans(arr,target);
        System.out.println(answer);


    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        while(target > arr[end] ){

            int temp=end+1;

            end = end + (end-start+1) * 2;


            start=temp;
        }
        return search(arr,start,end,target);
    }

    static int search(int[] arr, int start,int end ,int target){


        while (start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }

        }

        return -1;
    }
}
