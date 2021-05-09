import java.util.*;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        String line;
        String [] splitTakes;
        Hashtable<String, Integer> Phone = new Hashtable<String, Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        while(in.hasNext()){
             
            line = in.nextLine();
            if (line.contains("!!")) {
                
                System.out.println("Bye");
                break;
            }
            else {
                
                splitTakes = line.split(" ");
                if (splitTakes[1].contains("?")) {
                    
                    if (Phone.get(splitTakes[0]) == null)
                        System.out.println("Sorry, there is no " + splitTakes[0]);
                    else
                        System.out.println(splitTakes[0] + " has number " + Phone.get(splitTakes[0]));
                    
                }
                else {
                    
                    Phone.put(splitTakes[0], Integer.parseInt(splitTakes[1]));
                    
                }
                
                
            }	 	  	   	 	      	    	        	 	
             
         }
            
    }
}