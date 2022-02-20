package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance(meters): ");
        int distance = input.nextInt();

        System.out.print("Enter time(hh mm ss): ");
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();

        int totalTime = (hour * 3600) + (minute * 60) + (second);

        int speedInMeterPerSecond = distance / totalTime;
        int speedInKilometerPerHour = ((distance / 1000) / (totalTime / 3600));
        int speedInMilePerHour = ((distance / 1609) / (totalTime / 3600));

        System.out.println("--------------------------------------------");

        System.out.println("\nSpeed in meters per second: " + speedInMeterPerSecond + " meters/second");
        System.out.println("Speed in kilometers per hour: " + speedInKilometerPerHour + " kilometers/hour");
        System.out.println("Speed in miles per hour: " + speedInMilePerHour + " miles/hour");
    }
}
