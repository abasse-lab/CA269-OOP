public class WordScore
{
    
    int score;
    String word;
    
    public WordScore(String WordName) {
        
        word = WordName;
        
    }
    
    public int score(String takes) {
        
        String[] splitTakes = takes.split(" ");
        score = Integer.parseInt(splitTakes[1]);
        if (word.contains("story") == true)
            return -1;
        else if (takes.contains(word) == true)
            return score;
        else;
            return -1;
        
    }
    
    
}

	 	  	   	 	      	    	        	 	
