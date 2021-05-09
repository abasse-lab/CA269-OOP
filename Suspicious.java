import java.util.Scanner;
import java.io.File;
import java.util.Set;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.util.*;
public class Suspicious
{
    public static void main(String [] args)
    {
        try {
            String line;
            String line2;
        
            String file = args[0];
            String file2 = args[1];
        
            File ID = new File(file);
            Scanner scan = new Scanner(ID);
        
            File ID2 = new File(file2);
            Scanner scan2 = new Scanner(ID2);
            
            Hashtable<String, String> Phone = new Hashtable<String, String>();
        
            while(scan.hasNext()) {
            
                line = scan.nextLine();
                Phone.put(line, "yolo");
            }
            int count = 0;
            while (scan2.hasNext()) {
                
                line2 = scan2.nextLine();
                if (Phone.get(line2) != null) {
                    count++;
                    System.out.println(count + ". " + line2);
                }	 	  	   	 	      	    	        	 	
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}