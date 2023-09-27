package gr.aueb.cf.ch2;

import java.math.*;

public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger bigNum2 = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger result = new BigInteger("0");

        result = bigNum1.add(bigNum2);

        System.out.println(result);
    }
}
