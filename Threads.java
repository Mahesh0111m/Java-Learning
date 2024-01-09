import  java.lang.Thread;

//without thread

//class a
//{
//    public  void run()
//    {
//        for(int i=0;i<100;i++)
//            System.out.println("hi");
//    }
//}
//
//class b
//{
//    public  void run()
//    {
//        for(int i=0;i<100;i++)
//            System.out.println("hello");
//    }
//}
//public class Threads
//{
//    public static void main(String[] args)
//    {
//        a obj1= new a();
//        b obj2 = new b();
//
//        obj1.start();
//        obj2.start();
//
//    }
//}



//with threads



 class a extends Thread
{
    public  void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("hi");
    }
}

class b extends Thread
{
    public  void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("hello");
    }
}
public class Threads
{
    public static void main(String[] args)
    {
        a obj1= new a();
        b obj2 = new b();

        obj1.start();
        obj2.start();

    }
}
