import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {


        //sum of two integers without using functions
//
//        int num1,num2,sum;
//        System.out.println("input two numbers");
//
//        num1=in.nextInt();
//        num2=in.nextInt();
//        sum=num1+num2;
//
//        System.out.println("sum is" + " " + sum);

        //sum using function

        sum();
    }

    static  void sum()
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("enter two numbers");
        num1= in.nextInt();
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("sum is "+ " "+ sum);

    }
}
