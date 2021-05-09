
import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        double sum = 0;
        
        System.out.print("Enter " + num + " numbers: ");
        for(int i = 1; i <= num; i++)
        {
            double number_picked = in.nextDouble();
            sum = sum + number_picked;
        }
        // Read in the numbers (note that they could be floating point)
        
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
            
        System.out.println("The average is " + sum / num);
        in.close();
    }
}	 	  	   	 	      	    	        	 	
