import java.util.Scanner;

public class CompareAdjacentValues
{
    public static void detectAdjacentDuplicates()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit.");
        
        double input = scanner.nextDouble();
        while (scanner.hasNextDouble() == true)
        {
            double previousInput = input;
            input = scanner.nextDouble();
            if (previousInput == input)
            {
                System.out.println("Adjacent Duplicate Detected!");
            }
        }
    }
}