//Problem - 1019;

import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your total Seconds : ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);

    }
}
