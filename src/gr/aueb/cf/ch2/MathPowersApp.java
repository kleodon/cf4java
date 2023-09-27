package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Prints the square and cude value
 * of an integer given by user
 */
public class MathPowersApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num (int)");
        inputNum = in.nextInt();

        System.out.printf(Locale.US,"num: %d %n square: %d %n cube: %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
    }
}
