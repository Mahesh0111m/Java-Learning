public class Floor_of_number {
    public static void main (String[]args){
            int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 11};
            int target = 5;

            if (target < arr[0])
                System.out.println("enter valid number in array range");
            else {
                int ans = floor(arr, target);
                System.out.println(arr[ans]);
            }
        }


        static int floor ( int[] arr, int target){
            int start = 0, end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;
                }
            }

            return end;
        }
    }




