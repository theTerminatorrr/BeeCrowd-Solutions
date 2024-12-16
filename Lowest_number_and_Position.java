//BeeCrowd Problem - 1180;

import java.util.Scanner;

public class Lowest_number_and_Position
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array (N): ");
            int N = sc.nextInt();

            int[] X = new int[N];

            System.out.println("Enter " + N + " numbers:");
            int smallest = Integer.MAX_VALUE;
            int position = -1;

            for (int i = 0; i < N; i++)
            {
                X[i] = sc.nextInt();
                if (X[i] < smallest)
                {
                    smallest = X[i];
                    position = i;
                }
            }

            System.out.println("Smallest value: " + smallest);
            System.out.println("Position: " + position);

        }
}
