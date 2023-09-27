package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * This App displays a menu with te following options
 * 1. Εμφάνισε n αστεράκια οριζόντια
 * 2. Εμφάνισε n αστεράκια κάθετα
 * 3. Εμφάνισε n γραμμές με n αστεράκια
 * 4. Εμφάνισε n γραμμές με αστεράκια 1 – n
 * 5. Εμφάνισε n γραμμές με αστεράκια n – 1
 * 6. Έξοδος από το πρόγραμμα
 * *
 * Next writes the corresponding number of stars
 */
public class PrintStarsAppV2 {
    public static void main(String[] args) {
        int userChoice;

        while (true){
            printMenu();
            userChoice = getChoice();

            try {
                printChoice(userChoice);
                if (userChoice == 6){
                    System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας");
                    break;
                }

                printStars(userChoice,getNumberOfStars());
                
            }catch (IllegalArgumentException e){
                System.out.println("Μη έγκυρη επιλογή");
            }

        }
    }



    public static  void printMenu( ){
        System.out.println("Μενού επιλογών:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getChoice( ){
       Scanner in = new Scanner(System.in);
       int choice = 0;

       if (in.hasNextInt()) choice = in.nextInt();
       return choice;
    }

    public static void printChoice( int choice ) throws IllegalArgumentException{
        if (choice < 1 || choice > 6){
            throw new IllegalArgumentException();
        }else {
            System.out.println("Επιλέχτηκε η επιλογή: " + choice);
        }
    }

    public static int getNumberOfStars( ){
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Δώστε αριθμό για αστεράκια: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            }else {
                in.nextLine();
                System.out.println("Παρακαλώ δώστε έναν θετικό ακέραιο αριθμό");
            }
        }

    }

    public static void printStars( int userChoice, int numberOfStars ){

        System.out.println();

        switch (userChoice){
            case 1:
                printStarsHorizontally(numberOfStars);
                break;
            case 2:
                printStarsVertically(numberOfStars);
                break;
            case 3:
                printStarsBox(numberOfStars);
                break;
            case 4:
                printStarsAscending(numberOfStars);
                break;
            case 5:
                printStarsDescending(numberOfStars);
                break;
            default:
                System.out.println("Μη έγκυρη επιλογή");
                break;
        }
        System.out.println();
    }

    /** Prints n number of stars horizontally
     * @param numberOfStars number of stars to be printed
     * */
    public static void printStarsHorizontally( int numberOfStars ) {
        if (numberOfStars < 0 ) {
            return;
        }
        for (int i = 1; i <= numberOfStars; i++){
            System.out.print("*");
        }
    }

    /** Prints n number of stars vertically
     * @param numberOfStars (n) number of stars to be printed
     */
    public static void printStarsVertically( int numberOfStars ){
        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            System.out.println("*");
        }
    }

    /**
     Prints stars in a nxn square
     @param numberOfStars (n)
     */
    public static void printStarsBox( int numberOfStars ){
        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            printStarsHorizontally( numberOfStars );
            System.out.println();
        }
    }

    /**
     Prints stars in n lines with each line having one extra star from the previous
     staring from 1
     @param numberOfStars (n)
     */
    public static void printStarsAscending( int numberOfStars ){
        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            printStarsHorizontally( i );
            System.out.println();
        }
    }

    /**
     Prints stars in n lines with each line having one less star from the previous
     staring from n
     @param numberOfStars (n)
     */
    public static void printStarsDescending( int numberOfStars ){
        if (numberOfStars < 0 ) {
            return;
        }

        for (int i = 1; i <= numberOfStars; i++){
            printStarsHorizontally((numberOfStars - i) + 1);
            System.out.println();
        }
    }


}
