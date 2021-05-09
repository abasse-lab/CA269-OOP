import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();

        
        double [] lst = new double[num];
        System.out.print("Enter " + num + " numbers: ");
        double sum = 0;
        for(int i=0; i < num; i++)
        {
            double number_picked = in.nextDouble();

            sum = sum + number_picked;
            lst[i] = number_picked;
        }
        double avg = sum/num;
        // Read in the numbers (note that they could be floating point)
        System.out.print("The above average numbers are:\n");
        for(int i=0; i < num; i++)
        {
            if (lst[i] > avg)
            {
                System.out.print( " " + lst[i]);
            }
        }
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
        System.out.print('\n');
        in.close();
    }
}	 	  	   	 	      	    	        	 	