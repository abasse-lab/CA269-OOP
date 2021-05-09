import java.util.Scanner;

public class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        String even = "Even:";
        int j = 1;
        String odd = "Odd:";
        while(in.hasNext()) {
            n = in.nextInt();
            if (n % 2 == 0)
                even = even + " " + n;
                
            else if (n % 2 == 1 && n > 0)
                odd = odd + " " + n;
        }
    in.close();
    System.out.println(odd);
    System.out.println(even);
    }
}