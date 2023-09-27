package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if the imported year
 * is a leap year or not
 */
public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;

        System.out.println("Please insert a year (int)");
        year = in.nextInt();

        if (  year % 400 == 0  ||  ( year % 4 == 0  &&  year % 100 != 0 )  ){
            isLeapYear = true;
        }

        if ( isLeapYear ){
            System.out.printf("The year %d is a leap year", year);
        }else {
            System.out.printf("The year %d is not a leap year", year);
        }
    }
}
