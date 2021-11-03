import java.util.*;

public class Bid {
    public User user;
    public Date bidDate;
    public int bidPrice;

    public Bid(User User, int BidPrice)
    {
        user = User;
        bidPrice = BidPrice;
        //bidDate = current date and time
    }
}
