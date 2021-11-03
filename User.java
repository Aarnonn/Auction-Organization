import java.util.*;

public class User {

    public String username;
    public String email;
    public String password;
    public String walletAd;
    public int balance;
    public boolean isLoggedIn = false;
    
    public int xp = 0;

    public User(String Username, String Email, String Password, String WalletAd, int Balance)
    {
        username = Username;
        email = Email;
        password = Password;
        walletAd = WalletAd;
        balance = Balance;
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

    public String createAuction(String title, Date startDate, Date endDate, int startPrice, Database db)
    {
        if(!isLoggedIn) { return "You must be logged in to create an auction"; }

        Random rand = new Random();
        String str = Integer.toString(rand.nextInt(1)*10000);

        db.auctions.put(str, new Auction(title, startDate, endDate, startPrice));
        xp+=10;
        return str;
    }

    public void transfer(User giver, User recip, int price)
    {
        giver.balance -= price;
        recip.balance += price;
    }
}