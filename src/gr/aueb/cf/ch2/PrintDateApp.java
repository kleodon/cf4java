package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Takes 3 integers as input
 * and prints them as a Date
 * in format DD/MM/YY
 */
public class PrintDateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int yearLastTwoDigits = 0;

        System.out.println("Please provide the day");
        day = in.nextInt();

        System.out.println("Please provide the month");
        month = in.nextInt();

        System.out.println("Please provide the year");
        year = in.nextInt();

        yearLastTwoDigits = year % 100;

        System.out.printf("%02d/%02d/%2d",day,month,yearLastTwoDigits);
    }
}
