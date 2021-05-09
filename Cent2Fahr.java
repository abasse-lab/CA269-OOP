import java.util.Scanner;

public class Cent2Fahr {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int cent = in.nextInt();

        double far = (cent * 1.8) + 32;
        in.close();
        System.out.printf("%d %.1f\n",cent,far);
    }
}