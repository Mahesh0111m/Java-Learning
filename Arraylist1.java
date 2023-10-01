import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list.contains(3));
//        System.out.println(list.contains(50));
//        System.out.println(list);

        //input for arraylist
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }

        //get item at any index list[index] will not work use list.get(index).
        for(int i=0;i<5;i++)
        {
            System.out.print(list.get(i) + " "); // pass index here

        }


    }

}
