import java.util.Random;

public class MontyHall
{
    public static void montyHall()
    {
        int playerStrat = 0;
        int hostStrat = 0;
        Random random = new Random();
        int door = 0;
        int car = 0;
        for (int i = 0; i < 1000; i++)
        {
            door = random.nextInt(3) + 1;
            car = random.nextInt(3) + 1;
            if (door == car)
            {
                playerStrat++;
            }
            else
            {
                hostStrat++;
            }
        }
        System.out.println("Strategy 1 (player wins by switching to the host's choice): " + hostStrat + ".");
        System.out.println("Strategy 2 (player wins by sticking with the original): " + playerStrat + ".");
    }
}