//BeeCrowd Problem - 1134;

import java.util.Scanner;

public class Type_of_Fuel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int alcoholCount = 0;
        int gasolineCount = 0;
        int dieselCount = 0;

        while (true)
        {
            System.out.println("Enter the type of fuel (1: Alcohol, 2: Gasoline, 3: Diesel, 4: End):");
            int code = sc.nextInt();

            if (code == 4)
            {
                break;
            }

            switch (code)
            {
                case 1:
                    alcoholCount++;
                    break;
                case 2:
                    gasolineCount++;
                    break;
                case 3:
                    dieselCount++;
                    break;
                default:
                    System.out.println("Invalid code. Please enter a valid code.");
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO !");
        System.out.println("Alcohol: " + alcoholCount);
        System.out.println("Gasoline: " + gasolineCount);
        System.out.println("Diesel: " + dieselCount);
    }
}
