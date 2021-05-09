public class Word {
    static String showLetter(String text, char letter)
    {
        String count = "";
        for(int i=0;i<text.length();i++){
           if((letter + "").equals((text.charAt(i) + "")) == true){
               count += text.charAt(i);
           }
           else {
               count += "_";
           }
        }
        return count;
    }
}
