//BeeCrowd Problem - 1044;

import java.util.Scanner;

public class Multiples
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();

        if(B%A ==0)
        {
            System.out.println("Sao Multiplos.");
        }
        else
        {
            System.out.println("Nao Sao Multiplos.");
        }
    }
}
