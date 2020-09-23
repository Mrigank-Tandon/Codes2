package com.company;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);


        double a = input.nextDouble();

        double b = input.nextDouble();

        double c = input.nextDouble();

        double result = b * b - 4* a * c;

        if (result > 0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2 * a);
            System.out.println("Real and Distinct\n" + (int)r1 + " " + (int)r2);
        } else if (result == 0) {
            double r1 = -b / (2 * a);
            System.out.println("Real and Equal\n" + (int)r1);
        } else {
            System.out.println("Imaginary");
        }

    }
}
