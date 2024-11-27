//Problem - 1009;

import java.util.Scanner;

public class Salary_with_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double fixed_Salary = sc.nextDouble();
        double Overall_Sale = sc.nextDouble();
        double bonus = Overall_Sale * 0.15;

        double Total = fixed_Salary + bonus;

        System.out.println("TOTAL = " +Total);

    }
}
