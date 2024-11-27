//Problem - 1013;

import java.util.Scanner;

public class The_Greatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int greaterAB = (A + B + Math.abs(A - B)) / 2;
        int greatest = Math.max(greaterAB, C);

        System.out.println(greatest +" eh o maior");

    }
}
