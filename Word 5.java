public class Word {
    static String showLetters(String text, String letter)
    {
        String count = "";
        for(int i=0;i<text.length();i++){
           if((letter + "").contains((text.charAt(i) + "")) == true){
               count += text.charAt(i);
           }
           else {
               count += "_";
           }
        }
        return count;
    }
}
