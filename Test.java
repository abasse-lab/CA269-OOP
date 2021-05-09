public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String phrase)
    {
        int length = phrase.length();
        String swap = phrase.substring(length - 1, length) + phrase.substring(1, length - 1) + phrase.substring(0, 1);
        return swap;
    }
}