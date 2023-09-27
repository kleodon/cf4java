package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumAndMul10App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <=10 ) {
            System.out.println("Please insert int");
            num = in.nextInt();
            sum = sum + num;
            mul = mul * num;
            i++;
        }

        System.out.printf("The sum is %d and the mul is %d", sum, mul);
    }
}
