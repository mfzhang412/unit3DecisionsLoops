import java.util.Scanner;

/**
 * Write a program that prompts the user for a wavelength value and prints a description
 * of the corresponding part of the electromagnetic spectrum, as given in the following
 * table.
 * 
 * @author Michael Zhang
 * @version 21 october 2015
 */
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in a wavelength value: ");
        double wave = s.nextDouble();

        if (wave > 1e-1)
        {
            System.out.println("Radio Wave");
        }
        else if (wave > 1e-3)
        {
            System.out.println("Microwave");
        }
        else if (wave > 7e-7)
        {
            System.out.println("Infrared");
        }
        else
        {
            System.out.println("Other stuff");
        }
    }
}
