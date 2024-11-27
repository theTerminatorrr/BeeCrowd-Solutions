//Problem - 1010;

import java.util.Scanner;

public class Simple_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int unit1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int code2 = sc.nextInt();
        int unit2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total_amount = ((unit1 * price1) + (unit2 * price2));

        System.out.printf("VALOR A PAGAR = %.2f\n", total_amount);
    }
}
