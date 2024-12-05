//BeeCrowd Problem - 1101;

import java.util.Scanner;

public class Sequence_of_Numbers_and_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m<=0 || n<=0)
            {
                break;
            }
            int smaller = Math.min(m, n);
            int larger = Math.max(m, n);
            int sum = 0;

            for (int i = smaller; i<=larger; i++)
            {
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println("Result : " +sum);
        }
    }
}
