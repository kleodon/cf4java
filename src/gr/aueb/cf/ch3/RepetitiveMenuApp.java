package gr.aueb.cf.ch3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Displays a menu with the folowing options:
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Ενημέρωση
 * 4. Αναζήτηση
 * 5. Έξοδος
 *
 * If the user enters an invalid number
 * returns an error message
 */
public class RepetitiveMenuApp {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Μενού επιλογών:");
            System.out.println("1. Εισαγωγή ");
            System.out.println("2. Διαγραφή ");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choise = in.nextInt();


            if ( choise <= 0  ||  choise > 5 ){
                System.out.println("Παρακαλώ δώστε μια επιτρεπτή τιμή [1 - 5 ]");
            }
            
            if ( choise == 1){
                System.out.print("Επιλέξατε Εισαγωγή");
            } else if ( choise == 2) {
                System.out.print("Επιλέξατε Διαγραφή");
            } else if ( choise == 3) {
                System.out.print("Επιλέξατε Ενημέρωση");
            } else if ( choise == 4) {
                System.out.print("Επιλέξατε Αναζήτηση");
            } else if ( choise == 5) {
                break;
            }

            System.out.println(" (Με enter επιστρέφετε στο μενού)");
            System.in.read();

        } while ( choise != 5 );
    }
}
