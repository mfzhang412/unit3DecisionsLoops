import java.util.Scanner;

public class Diamond
{
    public static void diamond()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        int counter = 0;
        
        for (int i = 0; i <= integer; i++)
        {
            for (int index = 0; index < i; index++)
            {
                int spaces = integer / 2 - 1;
                for (int number = 0; number < spaces; number++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}