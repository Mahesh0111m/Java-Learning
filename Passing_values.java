public class Passing_values {
    public static void main(String[] args) {
        System.out.println("Passing int as values");
        int ans =  sum(10,20);
        System.out.println(ans);

        System.out.println("Passing string as values");

        String ans2=greet("Mahesh");
        System.out.println(ans2);

    }

    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    //passing string

    static String greet(String message){
        String ans="Hello" + " " +message;
        return ans;
    }
}
