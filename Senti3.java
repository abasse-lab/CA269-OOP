import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Senti3
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String word = args[0];
        String file = args[1];
        double count = 0.00;
        int appear = 0;
        File ID2 = new File(word);
        Scanner scan2 = new Scanner(ID2);
        String line = scan2.nextLine();
        String[] words = line.split(" ");
        int i;
        String k;
        int score;
        String line1;
        String [] splitTakes;
        if (words.length > 1) {
            
            for (i = 0;i < words.length;i++){
                k = words[i];
                File ID = new File(file);
                Scanner scan = new Scanner(ID);
                while(scan.hasNext()) {
                    line1 = scan.nextLine();
                    splitTakes = line1.split(" ");
                    score = Integer.parseInt(splitTakes[0]);
                    int j;
                    for (j = 0;j < splitTakes.length;j++) {
                        if (splitTakes[j].equals(k) == true) {
                            count = count + score;
                            appear = appear + 1;
                        }
                    }	 	  	   	 	      	    	        	 	
                }
                if (appear == 0)
                    System.out.printf("The score of " + k + " is 0.00.");
                 else
                    System.out.printf("The score of " + k + " is " + "%.2f" + ".", (double) count / appear);
                System.out.println();
                count = 0;
                appear = 0;
            }
        }
        else {
            File ID = new File(file);
            Scanner scan = new Scanner(ID);
            k = words[0];
            while(scan.hasNext()) {
                line1 = scan.nextLine();
                splitTakes = line1.split(" ");
                score = Integer.parseInt(splitTakes[0]);
                if (line1.contains(k) == true) {
                    count = count + score;
                    appear = appear + 1;
                
            }
        }
            if (appear == 0)
                    System.out.printf("The score of " + k + " is 0.00.");
                 else
                    System.out.printf("The score of " + k + " is " + "%.2f" + ".", (double) count / appear);
                    System.out.println();
        }
        
    }
}
	 	  	   	 	      	    	        	 	
