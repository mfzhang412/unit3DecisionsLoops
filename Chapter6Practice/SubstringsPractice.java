import java.util.Scanner;

public class SubstringsPractice
{
    public static void scrub1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();
        
        int length = input.length();

        while (length > 0)
        {
            int indexer = length - 1;
            while (indexer <= 7)
            {
                String output = input.substring(indexer-1, indexer);
                System.out.println(output);
                indexer -= 1;               
            }
            length -= 1;
        }
    }
}
