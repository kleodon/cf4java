package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts temperature from
 * Fahrenheit to Celsius
 */
public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celcius = 0;

        System.out.println("Please provide temperature in Fahrenheit");
        fahrenheit = in.nextInt();

        celcius = 5 * ( fahrenheit - 32 ) / 9;

        System.out.printf("The temperature in Celsius is: %d", celcius);
    }
}
