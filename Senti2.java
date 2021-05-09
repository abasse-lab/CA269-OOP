import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Senti2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String word = args[0];
        String file = args[1];
        int count = 0;
        int appear = 0;
        File ID = new File(file);
        Scanner scan = new Scanner(ID);
        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] splitTakes = line.split(" ");
            int score = Integer.parseInt(splitTakes[0]);
            if (line.contains(word) == true) {
                count = count + score;
                appear = appear + 1;
            }
        }
        System.out.println(word + " appears " + appear + " times.");
        if (appear == 0)
            System.out.printf("The average score of the reviews containing " + word + " is 0.00");
        else
            System.out.printf("The average score of the reviews containing " + word + " is " + "%.2f", (double) count / appear);
        System.out.println();
    }
}



	 	  	   	 	      	    	        	 	
