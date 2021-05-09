public class TotalArgs {
    public static void main(String [] args)
    {
        int sum = 0;
        int i = 0;
        while (i < args.length)
        {
            sum += Integer.parseInt(args[i]);
            i++;
        }
        System.out.printf("The sum of all the args is %d.\n", sum);

    }
}