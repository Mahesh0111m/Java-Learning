import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter number ");
        int num=in.nextInt();
        boolean ans = check(num);
        System.out.println(ans);
    }

    static boolean check(int num){
        if(num<=1) {
            return false;
        }
        int c=2;

        while (c*c<=num)
        {
            if(num%c==0){
                return false;
            }
            c++;

        }

        return true;

    }
}
