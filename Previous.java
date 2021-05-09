import java.util.*;
public class Previous
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int k;
        List<Integer> sortion = new ArrayList<Integer>();
        while(in.hasNext()) {
            n = in.nextInt();
            if (n >= 0)
                sortion.add(n);
        }
        System.out.println("Enter some numbers (-1 to end)");
        System.out.println("Previous:");
        String john = "";
        Set<Integer> occurence = new HashSet<>(sortion);
        for(int i: sortion) {
            
            k = Collections.frequency(sortion, i);
            if (k > 1 && john.contains(Integer.toString(i)) == true)
                System.out.println(i);

            else
                john = john + " " + Integer.toString(i);
        }
    }
}
	 	  	   	 	      	    	        	 	
