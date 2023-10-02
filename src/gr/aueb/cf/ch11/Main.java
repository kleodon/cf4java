package gr.aueb.cf.ch11;
import gr.aueb.cf.ch11.model.*;

/**
 * Driver class for {@link User} and {@link UserCredentials}.
 *
 * @author Nrigas
 */
public class Main {
    public static void main(String[] args) {
        long nickID = 1;
        User Nick = new User(nickID,"Nick","Rigas");
        UserCredentials NickCredentials = new UserCredentials(nickID,"nicolaosrigas","12345");

        System.out.println( "User {" +
                            "ID: " + Nick.getId() + "," +
                            "First Name: " + Nick.getFirstName()  + "," +
                            "Last Name: " + Nick.getLastName() + "," + "}"
        );

        System.out.println( "User Credentials {" +
                            "ID: " + NickCredentials.getId() + "," +
                            "User Name: " + NickCredentials.getUserName()  + "," +
                            "Password: " + NickCredentials.getPassword() + "," + "}"
        );


    }
}
