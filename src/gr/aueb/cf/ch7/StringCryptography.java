package gr.aueb.cf.ch7;

public class StringCryptography {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business, Coding Factory 2023";
        String encrypted;
        String decrypted;

        System.out.println("Original string: " + s);

        encrypted = encrypt(s);
        System.out.println("Encrypted string: " + encrypted);

        decrypted = decrypt(encrypted);
        System.out.println("Decrypted string: " + decrypted);

    }

    public static String encrypt(String s){
        StringBuilder sb = new StringBuilder();
        int ordinalNumber;

        for (int i = 0; i < s.length(); i++){
            ordinalNumber = s.charAt(i);
            sb.append((char) ( ordinalNumber + 1 ));
        }

        return sb.toString();
    }

    public static String decrypt(String s){
        StringBuilder sb = new StringBuilder();
        int ordinalNumber;

        for (int i = 0; i < s.length(); i++){
            ordinalNumber = s.charAt(i);
            sb.append((char) ( ordinalNumber - 1 ));
        }

        return sb.toString();
    }
}
