//Problem - 1041;

import java.util.Scanner;

public class Coordinates_of_a_Point
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Value of x : ");
        float x = sc.nextFloat();
        System.out.print("Enter the Value of y : ");
        float y = sc.nextFloat();

        if (x == 0 && y == 0)
        {
            System.out.println("The point is at the origin.");
        }
        else if (x == 0)
        {
            System.out.println("The point lies on the y-axis.");
        }
        else if (y == 0)
        {
            System.out.println("The point lies on the x-axis.");
        }
        else if (x > 0 && y > 0)
        {
            System.out.println("The point is in the first quadrant.");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("The point is in the second quadrant.");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("The point is in the third quadrant.");
        }
        else
        {
            System.out.println("The point is in the fourth quadrant.");
        }
    }
}