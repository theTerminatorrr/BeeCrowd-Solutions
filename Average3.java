//Problem - 1040;

import java.util.Scanner;

public class Average3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the first score: ");
        double N1 = sc.nextDouble();
        System.out.print("Enter the second score: ");
        double N2 = sc.nextDouble();
        System.out.print("Enter the third score: ");
        double N3 = sc.nextDouble();
        System.out.print("Enter the fourth score: ");
        double N4 = sc.nextDouble();

        double average = ( (N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1) ) / 10.0 ;

        System.out.printf("Average : %.1f\n", average);

        if(average >= 7.0)
        {
            System.out.println("Approved Student!");
        }
        else if(average <= 5.0)
        {
            System.out.println("Reproved Student!");
        }
        else
        {
            System.out.println("In exam student!");

            System.out.print("Exam score : ");
            double exam_score = sc.nextDouble();

            double final_average = (average + exam_score) / 2 ;

            if(final_average >= 5)
            {
                System.out.println("Approved student!");
            }
            else if(final_average <= 4.9)
            {
                System.out.println("Reproved student!");
            }
            System.out.printf("Average : %.1f\n", final_average);
        }
    }
}
