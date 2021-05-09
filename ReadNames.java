import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class ReadNames {

    public static void main(String [] args) throws IOException {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String input = in.next();
            FileReader file = new FileReader(input);

            BufferedReader bufferedReader = new BufferedReader(file);
            List<String> lines = new ArrayList<String>();

            String line = null;
            while ((line = bufferedReader.readLine()) != null) 
            {
                lines.add(line);
            }

            Collections.reverse(lines);
            int index = lines.size() - 1;
            lines.remove(index);
            String joining = String.join(" ", lines);
            System.out.print("The names in reverse order are:" + "\n" + joining + "\n");
            bufferedReader.close();
            in.close();
        }
        catch(IOException ex)
        {	 	  	   	 	      	    	        	 	
            System.out.println("File not found");
        }

    }
}