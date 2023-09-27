package gr.aueb.cf.ch3;

import java.util.Scanner;

public class RecursiveMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Patates");
            System.out.println("2. Ntomates");
            System.out.println("3. Agourgia");
            System.out.println("0. Giourgia");
            choise = in.nextInt();
        } while ( choise !=0 );
    }
}
