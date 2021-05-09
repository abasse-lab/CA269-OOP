import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.FileReader;


public class GroupStudents {

    public static void main(String [] args)
    {
        try{
            File inFile = null;
            inFile = new File(args[0]);
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(inFile));
            List<String> lst = new ArrayList<String>();
            String line = null;
            
            while ((line = br.readLine()) != null) 
            {
                lst.add(line);
            }
            Collections.reverse(lst);
            int index = lst.size() - 1;
            lst.remove(index);
            Collections.reverse(lst);
            for (String i : lst)
            {
                System.out.println(i);
            }

            br.close();

        }	 	  	   	 	      	    	        	 	
        catch(IOException ex)
        {
            System.out.println("File not found");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Usage: java ReadNames <filename>");
            
        }
    }

}

