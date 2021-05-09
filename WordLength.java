import java.util.*;

public class WordLength
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String line;
        String[] split;
        Hashtable<Integer, Integer> num = new Hashtable<Integer, Integer>();
        while(in.hasNext()){
              
            line = in.nextLine();
            split = line.split(" ");
            
            int i;
            for (i =1;i<12;i++){
                int count = 0;
                int j = 0;
                for(j = 0;j < split.length;j++) {
                    if (i == split[j].length())
                        count++;
                }
                if (count > 0) {
                    
                    
                    if (num.get(i) == null)
                        num.put(i, count);
                    else
                        num.put(i, num.get(i) + count); 
                    
                }
                    
                
            }
                
            
        }	 	  	   	 	      	    	        	 	
        for(int k =0; k < 12; k++) {
                
            if(num.get(k) != null)
                System.out.println(k + ": " + num.get(k));
        }
    }
}