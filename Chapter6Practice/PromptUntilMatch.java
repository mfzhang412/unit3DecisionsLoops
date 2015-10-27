import java.util.Scanner;

public class PromptUntilMatch
{
    public static double prompUntilmatch()
    {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        double input;
        
        do
        {
            System.out.println("Please enter a positive value < 100: ");
            input = scanner.nextDouble();
            
            if(input > 0 && input < 100)
            {
                valid = true;
            }
        }
        while (valid == false);
        
        return input;
    }
    
}
