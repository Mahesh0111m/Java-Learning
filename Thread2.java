import java.lang.Thread;
class aa extends Thread
{
    public  void run()
    {
        for(int i=0;i<100;i++)
            System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class bb extends Thread
{
    public  void run()
    {
        for(int i=0;i<100;i++)
            System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class Thread2
{

    public static void main(String[] args) {
        aa obj1= new aa();
        bb obj2=new bb();

        obj1.start();
        obj2.start();
    }
}
