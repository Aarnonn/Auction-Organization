import java.util.*;

public class Auction
{
    public User AuctionUser = new User("auction", "", "", "", 0);
    public String title;
    public Date startDate;
    public Date endDate;
    public int startPrice;
    
    public int highestBid = 0;
    public ArrayList<Bid> arr = new ArrayList<Bid>();
    public int views = 0;

    public Auction(String Title, Date StartDate, Date EndDate, int StartPrice)
    {
        title = Title;
        startDate = StartDate;
        endDate = EndDate;
        startPrice = StartPrice;
    }

    public void placeBid(User user, int price)
    {
        if(!user.isLoggedIn || price <= highestBid || user.balance < price) 
        { 
            System.out.println("Unsuccessful Bid");
            return; 
        }

        highestBid = price;
        arr.add(new Bid(user, price));
        user.transfer(user, AuctionUser, price);
        user.xp += 10;
        //email method
        //loops through bidders and notifies them

        System.out.println("Successful Bid");
    }
}