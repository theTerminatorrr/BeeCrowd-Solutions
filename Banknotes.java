//Problem - 1018;

import java.util.Scanner;

public class Banknotes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Amount : ");
        int amount = sc.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        if (amount < 1000000 && amount != 0)
        {
            for (int note : banknotes)
            {
                int count = amount / note;
                amount %= note;
                if (count > 0)
                {
                    System.out.println( note + " Notes : " + count);
                }
            }
        }
    }
}
