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

    public int getuserID(int userID) {return this.userID;};
    public String getuserFirstName(String userFirstName) {return this.userFirstName;}
    public String getuserLastName(String userLastName) {return this.userLastName;}
    public String getPassword(String password) {return this.password;}
}
