import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int num=in.nextInt();
        boolean ans = check(num);
        System.out.println(ans);
    }

    static boolean check(int num){
        int temp=num;
        int sum=0;

        while (num>0)
        {
            int rem= num%10;
            sum+=rem*rem*rem;
            num=num/10;
        }
        if(sum==temp)
        {
            return true;
        }
            return false;
    }
}
