public class Word {
    static boolean allDone(String text, String letter)
    {
        int count = 0;
        for(int i=0;i<text.length();i++){
           if(letter.contains((text.charAt(i) + "")) == true){
               count++;
           }
        }
        return count == text.length();
    }
}
