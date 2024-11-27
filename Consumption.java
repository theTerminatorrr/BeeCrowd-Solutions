//Problem - 1014;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total_distance_traveled = sc.nextInt();
        double spent_fuel_total = sc.nextDouble();

        double consumption = total_distance_traveled / spent_fuel_total;

        System.out.printf("Consumption = %.3f km/L" ,consumption);

    }
}
