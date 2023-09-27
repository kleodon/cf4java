package gr.aueb.cf.ch2;

public class TwoRandomDiceApp {
    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;
        final int MAX = 6;
        final  int MIN = 1;


        die1 = (int) ( Math.random() * MAX - MIN + 1 ) + MIN;
        die2 = (int) ( Math.random() * MAX - MIN + 1 ) + MIN;

        System.out.printf("Die1: %d \nDie2: %d", die1, die2);
    }
}
