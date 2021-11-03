import java.util.*;

public class Auction
{
    public User AuctionUser = new User("auction", "", "", "", 0);
    public User creator;
    public String title;
    public Date startDate;
    public Date endDate;
    public int startPrice;
    
    public Bid highestBid = new Bid(new User(), 0);
    public int views = 0;

    public Auction(User Creator, String Title, Date StartDate, Date EndDate, int StartPrice)
    {
        creator = Creator;
        title = Title;
        startDate = StartDate;
        endDate = EndDate;
        startPrice = StartPrice;
    }

    public void placeBid(User user, int price)
    {
        if(!user.isLoggedIn || price <= highestBid.bidPrice || user.balance < price) 
        { 
            System.out.println("Unsuccessful Bid");
            return; 
        }

        highestBid.user.transfer(AuctionUser, highestBid.user, highestBid.bidPrice);
        highestBid = new Bid(user, price);
        user.transfer(user, AuctionUser, price);
        user.xp += 10;


        //email method
        //loops through bidders and notifies them

        System.out.println("Successful Bid");
    }

    public void endAuction()
    {
        creator.transfer(AuctionUser, creator, highestBid.bidPrice);
    }
}