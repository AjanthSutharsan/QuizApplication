package Model;

public class Users {
    private int userID;
    private String userFirstName;
    private String userLastName;
    private String password;

    public Users(int userID, String userFirstName, String userLastName, String password) {
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.password = password;
    }
}
