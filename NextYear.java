import java.util.Scanner;

public class NextYear {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        System.out.print("What age are you: ");
        int age = in.nextInt();
        int add = age + 1;
        in.close();
        System.out.printf("Hello %s, next year you will be %d.\n",name, add);
    }
}