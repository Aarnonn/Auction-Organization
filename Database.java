import java.util.*;

public class Database 
{
    public HashMap<String, Auction> auctions = new HashMap<String, Auction>();
    public HashMap<String, User> users = new HashMap<String, User>();

    public String createUser(String Username, String Email, String Password, String WalletAd, int Balance)
    {
        User user = new User(Username, Email, Password, WalletAd, Balance);

        Random rand = new Random();
        String str = Integer.toString(rand.nextInt(1)*10000);

        users.put(str, user);
        return str;
    }

    public void displayAuctions()
    {
        for(int i = 0; i < auctions.size(); i++)
        {
            System.out.print(auctions.toString());
        }
    }
}