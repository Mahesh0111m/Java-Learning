public class Linear_Search {
    public static void main(String[] args) {
        String name = "abcdefsad";
        char target= 'd';
        System.out.println(search(name,target));

    }

    static boolean search(String name, char target)
    {
        for (int i=0;i<name.length();i++)
        {
            if(target==name.charAt(i))
            {
                return true;
            }
        }
        return  false;
    }
}
