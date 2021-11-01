public class User {

    private String username;
    private String email;
    private String password;
    private String walletAd;
    private boolean isLoggedIn = false;
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
        if(user.equals(username) && pass.equals(password))
        {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void signOut()
    {
        isLoggedIn = false;
    }
}