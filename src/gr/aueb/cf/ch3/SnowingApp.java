package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it is snowing
 * based on the temperature *
 * temperature < 0 -> snowing
 * temperature > 0 -> not snowing
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temperature = 0;

        System.out.println("Please insert current temperature");
        temperature = in.nextInt();

        isSnowing = ( temperature < 0 );

        System.out.println("Is snowing: "+ isSnowing);

    }
}
