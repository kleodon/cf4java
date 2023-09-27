package gr.aueb.cf.ch3;

import java.util.Scanner;

public class CalcDigitsSumOfIntApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int remaining = 0;
        int digit = 0;
        int count = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        System.out.println("Please insert an integer:");
        remaining = inputNum = in.nextInt();

        do {
            count++;
            digit = remaining % 10;
            remaining = remaining / 10;

            if (count == 1) lastDigit = digit;
        }while (remaining > 0);

        firstDigit = digit;

        System.out.printf("Number of digits: %d\n", count);
        System.out.printf("First digit: %d\n", firstDigit);
        System.out.printf("Last digit: %d\n", lastDigit);
    }
}
