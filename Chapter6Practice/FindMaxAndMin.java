import java.util.Scanner;

public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers or any character to quit.");
        
        double largest = scanner.nextDouble();
        while (scanner.hasNextDouble())
        {
            double input = scanner.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        
        return largest;
    }
}