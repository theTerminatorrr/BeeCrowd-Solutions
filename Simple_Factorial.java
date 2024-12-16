//BeeCrowd Problem - 1153;

import java.util.Scanner;

public class Simple_Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();

        if (N < 0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        else
        {
            long factorial = 1;

            for (int i = 1; i <= N; i++)
            {
                factorial *= i;
            }

            System.out.println("Factorial of " + N + " is: " + factorial);
        }
    }
}
