import java.util.Scanner;

public class Diamond
{
    public static void diamond()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        int counter = 0;
        int i = 0;
        
        for (i = 0; i < integer; i++)
        {
            for (int spaces = 0; spaces < integer - i; spaces++)
            {
                System.out.print(" ");
            }
            if (i == 0)
            {
                System.out.print("*");
            }
            else
            {
                for (int index = 0; index < i * 2 + 1; index++)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i2 = 0; i2 < integer - 1; i2++)
        {
            System.out.print(" ");
            for (int spaces = 0; spaces < i2 + 1; spaces++)
            {
                System.out.print(" ");
            }
            for (int index = i * 2 + 1 - 2 * i2 - 4; index > 0; index--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}