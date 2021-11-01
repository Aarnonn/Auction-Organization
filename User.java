public class User {

    private String username;
    private String email;
    private String password;
    private String walletAd;
    private int xp;

    public User(String Username, String Email, String Password, String WalletAd, int XP)
    {
        username = Username;
        email = Email;
        password = Password;
        walletAd = WalletAd;
        xp = XP;
    }

    public boolean signIn(String user, String pass)
    {
        return user.equals(username) && pass.equals(password);
    }
}