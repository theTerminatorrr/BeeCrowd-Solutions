//BeeCrowd Problem - 1858;

import java.util.Scanner;

public class Theons_Answer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] T = new int[N];

        for (int i = 0; i < N; i++)
        {
            T[i] = sc.nextInt();
        }

        int minIndex = 0;

        for (int i = 1; i < N; i++)
        {
            if (T[i] < T[minIndex])
            {
                minIndex = i;
            }
        }
        
        System.out.println(minIndex + 1);
    }
}
