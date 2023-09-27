package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 Prints stars in n lines with each line having one less star from the previous
 staring from n
 n is provided by user
 */
public class PrintStarsDescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please provide the number of stars to be printed");
        numberOfStars = in.nextInt();

        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            for (int j = i; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
