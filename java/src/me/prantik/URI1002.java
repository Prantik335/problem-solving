package me.prantik;
// URI 1001 | Area of a Circle | BEGINNER | LEVEL 4 |  + 4.9 POINTS

import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        double r = scanner.nextDouble();

        double a = PI * r * r;

        System.out.printf("A=%.4f\n", a);
    }
}