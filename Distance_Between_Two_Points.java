//Problem - 1015;

import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double calulation = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        double answer = Math.sqrt(calulation);

        System.out.printf("%.4f\n",answer);
    }
}
