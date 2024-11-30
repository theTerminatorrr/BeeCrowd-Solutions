//Problem - 1042;

import java.util.Scanner;

public class SimpleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st integer : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd integer : ");
        int y = sc.nextInt();
        System.out.print("Enter 3rd integer : ");
        int z = sc.nextInt();

        int originalX = x;
        int originalY =y;
        int originalZ = z;

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Sorted order :" + x + " " + y + " " + z );
        System.out.println();
        System.out.println("Original order :" + originalX + " " + originalY + " " + originalZ );
    }
}
