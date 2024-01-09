public class Pattern {
    public static void main(String[] args) {
      //  pattern1(4);
        pattern2(4);
    }


    static void pattern1(int n) {
        for (int row=0;row<2 * n;row++)
        {
            int sum= row > n ? 2 * n - row: row;
            for(int col=0;col<sum;col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int spaces=1;spaces<=n-row;spaces++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col);
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col);
            }

            System.out.println();
        }
    }

}