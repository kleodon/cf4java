package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PositivesCountApp {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int count = 0;

        while (num >= 0 ) {
            System.out.println("Please insert int");
            num = in.nextInt();
            if (num < 0) break;
            count = count + 1;
        }

        System.out.printf("The Count is %d ", count);
    }
}
