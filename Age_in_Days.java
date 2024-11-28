//Problem - 1020;

import java.util.Scanner;

public class Age_in_Days
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age (in Days): ");
        int age = sc.nextInt();

        int years = age / 365;
        int remaining_days = age % 365;
        int months = remaining_days / 30;
        int days = remaining_days % 30;

        System.out.printf("Years: %d \n", years);
        System.out.printf("Months: %d \n", months);
        System.out.printf("Days: %d \n", days);
    }
}
