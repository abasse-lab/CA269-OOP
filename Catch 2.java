public class Catch
{
   public static void main(String [] args)
   {
       try
       {
       Broken broke = new Broken();
       System.out.println("Testing");
       broke.cracked();
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("ArrayIndexOutOfBoundsException");
       }
       catch(NullPointerException e)
       {
           System.out.println("NullPointerException");
       }
       catch(ArithmeticException e)
       {
           System.out.println("ArithmeticException");
       }
       System.out.println("Finally!");

   }
}	 	  	   	 	      	    	        	 	
