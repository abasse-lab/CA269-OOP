public class ReverseArgs
{
    public static void main(String [] args)
    {

        for(int i=0; i < args.length/2; i++)
        {
            String temp = args[i]; 
            args[i] = args[args.length -i -1]; 
            args[args.length -i -1] = temp;

        }

        int i = 0;
        while (i < args.length)
        {
            System.out.print("args[" + (args.length - i - 1)+ "] = " + args[i]);
            System.out.println();
            i++;
        }
    }
}