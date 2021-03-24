package pcProject;

public class User {
    public String Username;
    public String remTime; //남은시간
    public String UserID;
    public String UserPassword;

    User(String UserID, String UserPassword, String Username, String remTime){
        this.UserID = UserID;
        this.UserPassword = UserPassword;
        this.Username = Username;
        this.remTime = remTime;
    }

    public static User m1 = new User("abcd","123","박지연","67분");
}
