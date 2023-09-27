package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = 0;
        float exponent = 0;

        System.out.println("Give base:");
        base = in.nextFloat();

        System.out.println("Give exponent:");
        exponent = in.nextFloat();

        System.out.println("Result is:" + power(base,exponent));

    }

    public static float power( float base, float exponent){
        if (exponent < 0) return  1 / power(base, -exponent);

        if (exponent == 0) return 1;

        return  base * power(base, --exponent);
    }
}
