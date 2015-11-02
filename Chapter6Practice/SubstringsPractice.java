import java.util.Scanner;

public class SubstringsPractice
{
    public static void scrub1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();
        
        int length = input.length();
        int index2 = 0;
        int index;
        for (int i = 0;
             i < length;
             i++)
        {
            index = i;
            while(i+index2 < length)
            {
                System.out.println(input.substring(index, index+index2));
                index++;
            }
            index2++;
        }
    }
}
