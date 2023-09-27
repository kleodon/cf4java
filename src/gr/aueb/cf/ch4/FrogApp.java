package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPosition = 0;
        int finalPosition = 0;
        int jumpDistance = 0;
        int counter = 0;

        System.out.println("Please provide Start position, End position, Jump distance:");
        startPosition = in.nextInt();
        finalPosition = in.nextInt();
        jumpDistance  = in.nextInt();

        for (int i = startPosition; i < finalPosition; i += jumpDistance){
            counter++;
        }

        System.out.printf("Frog needs %d jumps to reach his destination", counter );
    }
}
