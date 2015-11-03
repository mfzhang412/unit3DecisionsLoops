import java.util.Random;

public class NumericalMethods
{
    public static void numericalMethods()
    {
        int x = 0;
        int y = 0;
        Random random = new Random();
        for (int intersections = 0; intersections < 100; intersections++)
        {
            int direction = random.nextInt(4) + 1;
            
            if (direction == 1)
            {
                x++;
            }
            if (direction == 2)
            {
                y++;
            }
            if (direction == 3)
            {
                x--;
            }
            if (direction == 4)
            {
                y++;
            }
        }
        System.out.println("(" + x + "," + y + ")");
    }
}