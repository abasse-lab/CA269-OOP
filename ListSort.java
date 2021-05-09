import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList; 
import java.util.List;

public class ListSort
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        List<Integer> sortion = new ArrayList<Integer>();
        while(in.hasNext()) {
            n = in.nextInt();
            if (n >= 0)
                sortion.add(n);
        }
        in.close();
        Collections.sort(sortion);
        String sorted = "Sorted:";
        for (int i = 0;i < sortion.size();i++) {
        
            sorted = sorted + " " + sortion.get(i);
        
        }
        System.out.println(sorted);
    }
}	 	  	   	 	      	    	        	 	
