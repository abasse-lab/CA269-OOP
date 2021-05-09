// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);

        // Now you have the word ... encourage the user to guess.
        System.out.println("The word is");
        String sount = "";
        for(int i = 0;i<word.length();i++){
            sount += "_";
        }
        System.out.println(sount);
        int count = 0;
        while(count != word.length()){
            System.out.println("Guess a letter:");
            char letter = in.next().charAt(0);
            if((word).contains((letter + ""))) {
                for(int i = 0;i<word.length();i++){
                    if((word.charAt(i) + "").equals((letter + ""))) {
                        sount = sount.substring(0,i) + letter + sount.substring(i+1);
                        count++;
                    }
                }
            }
            System.out.println(sount);
        }
        System.out.println("Well Done, the word was " + sount + ".");
    }	 	  	   	 	      	    	        	 	
}
        
