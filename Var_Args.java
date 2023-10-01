import java.util.Arrays;

public class Var_Args {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,8,744,32,35);

        fun2("Mahesh","a","aaass","dddsa");
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    //for string

    static void fun2(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
