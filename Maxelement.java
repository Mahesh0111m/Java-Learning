public class Maxelement {
    public static void main(String[] args) {
        int[] arr ={22,32,12,4,55};

        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxi=arr[0];

        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>maxi)
                maxi=arr[i];
        }

        return maxi;

    }
}
