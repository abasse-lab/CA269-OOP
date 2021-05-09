import java.util.Scanner;

public class Temp 

{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        double far = in.nextDouble();
        double cel = Convert.fahr2cels(far);
        in.close();
        System.out.printf("%.3f\n", cel);
    }
}