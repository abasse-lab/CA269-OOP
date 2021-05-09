/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int length = word.length() - 1;
        for(int i = 0;i < length;i++){
            if("hi".equals(word.substring(i, i+2))){
                System.out.println("hi");
            }
        }
            
    }
}	 	  	   	 	      	    	        	 	
