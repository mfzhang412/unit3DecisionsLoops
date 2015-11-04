import java.util.Scanner;

public class NumericalMethods
{
    public static void numericalMethods()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in an integer: ");
        int integer = scanner.nextInt();
        int fold1 = 0;
        int fold2 = 1;
        int foldnew = 1;
        if (integer == 1)
        {
            System.out.println(fold1);
        }
        else if (integer == 2)
        {
            System.out.println(fold2);
        }
        else if (integer == 3)
        {
            System.out.println(foldnew);
        }
        else
        {
            for (int i = 0; i < integer - 3; i++)
            {
                fold1 = fold2;
                fold2 = foldnew;
                foldnew = fold1 + fold2;
            }
            System.out.println(foldnew);
        }
    }
}