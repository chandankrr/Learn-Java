package com.ChandanKrr;

import java.awt.*;
import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {
        // Writing a program that fills an array with n Points entered by the user.
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements? (max is 20): ");
        int n = input.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, try again: ");
            n = input.nextInt();
        }

        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.print("The elements are: ");
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for Point " + i + 1 + ": ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }
}
