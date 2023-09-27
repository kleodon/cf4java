package gr.aueb.cf.ch10;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Scanner;

/**
 * Αναπτύξτε μία εφαρμογή που διαβάζει έναν-έναν τους χαρακτήρες ενός αρχείου
 * και τους εισάγει σε ένα πίνακα 256x2. Κάθε θέση του πίνακα είναι επομένως
 * ένας πίνακας δύο θέσεων, όπου στη 1η θέση αποθηκεύεται ο χαρακτήρας που έχει
 * διαβαστεί (αν δεν υπάρχει ήδη στον πίνακα) και στη 2η θέση αποθηκεύεται το πλήθος
 * των φορών που έχει διαβαστεί (βρεθεί) κάθε χαρακτήρας. Χαρακτήρες θεωρούνται και τα
 * κενά και οι αλλαγές γραμμής και γενικά οποιοσδήποτε UTF-8 χαρακτήρας.
 * Στο τέλος η main() παρουσιάζει στατιστικά στοιχεία για κάθε χαρακτήρα όπως η συχνότητα
 * εμφάνισής του στο κείμενο ταξινομημένα ανά χαρακτήρα και ανά συχνότητα εμφάνισης.
 */

public class CharReadAndStatisticsApp {
    final static Path path = Paths.get("C:/tmp/logTextStatistics.txt");
    final static int[][] text = new int[256][2];
    static int pivot = -1;
    static int count = 0;
    //final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            readTextAndSaveService();
            printStatisticsService ();
        } catch (IOException e) {
            System.out.println("Error in 1/0");
        }
    }


    /**
     * Reads text from a file using a FileInputStream with 4096 bytes buffering.
     * Then, each char is saved in the 2D array.
     *
     * @throws IOException              if file name is invalid.
     * @throws IllegalArgumentException if 2D array is full or any storage error.
     */

    public static void readTextAndSaveService() throws IOException, IllegalArgumentException {
        //int ch;
        byte[] buf = new byte[4096];
        int n = 0;

        try (FileInputStream fs = new FileInputStream("C:/tmp/inputText.txt")) {
            while ((n = fs.read(buf)) > 0) {
                for (int i = 0; i < n; i++) {
                    if (!saveChar(buf[i])) throw new IllegalArgumentException("Error in save");
                    else {
                        count++;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }


    /**
     * For each char in the input text, ot prints the count and
     * the percentage, sorted by char asc and percentage asc.
     */

    public static void printStatisticsService() {
        int[][] copiedText = Arrays.copyOfRange(text, 0, pivot + 1);
        Arrays.sort(copiedText, Comparator.comparing(a -> a[0]));
        System.out.println("Statistics (Char Ascending)");
        for (int[] ints : copiedText) {
            System.out.printf("%c\t%d\t%.4f%% \n", ints[0], ints[1], ints[1] / (double) count);
        }
        Arrays.sort(copiedText, Comparator.comparing(a -> a[1]));
        System.out.println("Statistics (Percentage Ascending)");
        for (int[] ints : copiedText) {
            System.out.printf("%c\t%d\t%.4f%% \n", ints[0], ints[1], ints[1] / (double) count);
        }
    }


    /**
     * Inserts a char in a 2D array together with its
     * occurrences' count in the text.
     * true, if the char inserted in 2D array, false, otherwise.
     *
     * @param ch the char
     * @return true for success, false for error
     */
    public static boolean saveChar(int ch) {
        int charPosition = -1;
        boolean inserted = false;
        if (isFull(text)) {
            return false;
        }

        charPosition = getCharPosition(ch);
        if (charPosition == -1) {
            pivot++;
            text[pivot][0] = ch;
            text[pivot][1] += 1;
            inserted = true;
        } else {
            text[charPosition][1]++;
            inserted = true;
        }
        return inserted;
    }


    public static int getCharPosition(int ch) {
        for (int i = 0; i <= pivot; i++) {
            if (text[i][0] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(int[][] text) {
        return pivot == text.length - 1;
    }

    public static void log(Exception e) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
