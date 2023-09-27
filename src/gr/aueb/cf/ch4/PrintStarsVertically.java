package gr.aueb.cf.ch4;

import java.util.Scanner;
/**
 Prints n number of stars vertically
 n is provided by user
 */

public class PrintStarsVertically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please provide the number of stars to be printed");
        numberOfStars = in.nextInt();

        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            System.out.println("*");
        }
    }
}


