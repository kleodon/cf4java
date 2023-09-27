package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * we insert start, end and step
 * and it prints stars.
 */
public class StarsStepApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end =0;
        int step = 0;
        int i = 0;

        System.out.println("Please insert start, end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }

    }
}
