package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if its raining based on the temperature
 * and the rain.
 * If it rains and the temperature <0
 * then it snows, otherwise not.
 */
public class SnowRainApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
