//Problem - 1006;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        double average = ((A * 2 +B * 3 +C * 5) / (2+3+5));

        System.out.printf("MEDIA = %.1f%n", average);
    }
}
