public class Minimum_number {
    public static void main(String[] args) {
        int[] arr={13,12,31,41,15,6,23};
        System.out.println(min(arr));
    }

    static int min(int[] arr)
    {
        int ans=arr[0];

        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<ans)
                ans=arr[i];
        }
        return ans;
    }
}
