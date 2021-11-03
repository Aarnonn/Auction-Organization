import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Auction
{
    private String title;
    private String image;
    private Date startDate;
    private Date endDate;
    private int startPrice;

    private ArrayList<Bid> arr = new ArrayList<Bid>();
    private int views = 0;
}