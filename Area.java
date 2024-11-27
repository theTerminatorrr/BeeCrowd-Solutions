//Problem - 1012;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double area_of_triangle = 0.5 * A * C ;
        double radius_circle = C * C * 3.14159 ;
        double area_of_trapezium =  ((A + B) / 2) * C ;
        double area_of_square  = B * B;
        double area_of_rectangle = A * B;


        System.out.printf("Triangle = %.3f\n", area_of_triangle);
        System.out.printf("Circle = %.3f\n", radius_circle);
        System.out.printf("Trapezium = %.3f\n", area_of_trapezium);
        System.out.printf("Square = %.3f\n", area_of_square);
        System.out.printf("Rectangle = %.3f\n", area_of_rectangle);
    }
}
