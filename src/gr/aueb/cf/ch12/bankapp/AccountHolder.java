package gr.aueb.cf.ch12.bankapp;

/**
 * The AccountHolder the person who signs the contract
 * for said account with the bank
 */
public class AccountHolder {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String ssn;


    public AccountHolder(Long id, String firstName, String lastName, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    /**
     * Returns the holder's state in string format.
     *
     * @return
     *      the string-representation of the state of the holder.
     */
    public String convertToString(){
        return    id + ", "
                + firstName + ", "
                + lastName + ", "
                + ssn ;
    }
}
