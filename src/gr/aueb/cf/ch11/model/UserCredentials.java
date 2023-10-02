package gr.aueb.cf.ch11.model;

/**
 * UserCredentials class
 */
public class UserCredentials {
    private long id;
    private String userName;
    private String password;

    public UserCredentials(){
    }

    public UserCredentials(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
