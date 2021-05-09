// Make the Date class implement the comparable interface

public class Date implements Comparable<Date>
{
   private int day, month, year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
   
   public int compareTo(Date x)
   {
        if (this.year > x.year)
        {
            return 1;
        }
        else if (this.year < x.year)
        {
            return -1;
        }

        if (this.month > x.month)
        {
            return 1;
        }

        else if (this.month < x.month)
        {
            return -1;
        }	 	  	   	 	      	    	        	 	

        if (this.day > x.day)
        {
            return 1;
        }
        else if (this.day < x.day)
        {
            return -1;
        }
        return 0;
    }
}