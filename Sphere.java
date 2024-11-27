//Problem - 1011;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        double volume = ((4/3.0) * 3.14159 * (R*R*R)) ;
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
