// Create a Word class with one static method called isFirstLetter
public class Word {
    static boolean isFirstLetter(String text, char letter)
    {
        String first = letter + "";
        String firs = text.charAt(0) + "";
        return firs.equals(first);
    }
}