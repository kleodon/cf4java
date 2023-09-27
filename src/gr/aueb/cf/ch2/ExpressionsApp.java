package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;




        result = num1 + num2 * num2 - 5 / num1 % 4;

        System.out.printf(" sum : %d \n sub : %d \n mul: %d \n div: %d \n ",
            sum, sub, mul, div, mod  );

    }
}