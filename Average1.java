//Problem - 1005;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        double average = ((A * 3.5 + B * 7.5) / (3.5 + 7.5));

        System.out.printf("MEDIA = %.5f%n", average);
    }
}
