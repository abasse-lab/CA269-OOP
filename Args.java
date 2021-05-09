public class Args
{
    public static void main(String [] args)
    {
        int i = 0;
        while (i < args.length)
        {
            System.out.print("args[" + i + "] = " + args[i]);
            System.out.println();
            i++;
        }
    }
}