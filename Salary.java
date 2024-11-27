//Problem - 1008;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        int WorkHour = sc.nextInt();
        double Salary_Per_Hour = sc.nextDouble();

        double Salary = (WorkHour * Salary_Per_Hour);

        System.out.println("Number = " +Number);
        System.out.printf("Salary = USD %.2f%n", Salary);
    }
}
