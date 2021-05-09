import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        
        String word = args[0];
        String file = args[1];
        int count = 0;
        File ID = new File(file);
        Scanner scan = new Scanner(ID);
        while(scan.hasNext()) {
            
            String line = scan.nextLine();
            if (line.contains(word) == true)
                count = count + 1;
            
        }
        
        System.out.println(word + " appears " + count + " times.");
    }
}