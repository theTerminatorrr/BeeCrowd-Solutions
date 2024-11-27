//Problem - 1002;

import java.util.Scanner;

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        double area = 3.14159 * r * r ;

        System.out.println("A = " +area);
    }
}
