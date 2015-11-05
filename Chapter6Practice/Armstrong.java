import java.util.Scanner;

public class Armstrong
{
    public static void armstrong()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (less than 1000): ");
        String integer = scanner.next();
        int length = integer.length();
        
        if (length >= 1)
        {
            String oneString = integer.substring(length - 1, length);
        }
        if (length >= 2)
        {
            String tenString = integer.substring(length - 2, length - 1);
        }
        if (length >= 3)
        {
            String hundredString = integer.substring(length - 3, length - 2);
        }
        if (length == 4)
        {
            String thousandString = integer.substring(length - 4, length - 3);
        }
    }
}