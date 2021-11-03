import java.util.Date;

public class Tester
{
    public static void main(String[] args)
    {
        Database db = new Database();
        String matteoCode = db.createUser("Matteo", "Email", "Password", "WalletAd", 100);
        String billyCode = db.createUser("Billy", "Email", "Password", "WalletAd", 100);
        String johnCode = db.createUser("John", "Email", "Password", "WalletAd", 100);

        User matteo = db.users.get(matteoCode);
        matteo.signIn("Matteo", "Password");
        User billy = db.users.get(billyCode);
        billy.signIn("Billy", "Password");
        User john = db.users.get(johnCode);
        john.signIn("John", "Password");

        String auctionCode = matteo.createAuction("title", new Date(), new Date(), 0, db);

        db.displayAuctions();
        Auction auction = db.auctions.get(auctionCode);

        auction.placeBid(billy, 10);
        auction.placeBid(john, 15);
        auction.endAuction();
    }
}