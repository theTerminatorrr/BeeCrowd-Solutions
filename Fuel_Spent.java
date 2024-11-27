//Problem - 1016;

import java.util.Scanner;

public class Fuel_Spent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Time in the Trip (hour): ");
        int x = sc.nextInt();

        System.out.print("Average Speed (km/h): ");
        int y = sc.nextInt();

        double distance = x * y;

        double calculation = distance / 12.0;

        System.out.printf("%.3f", calculation);
    }
}
