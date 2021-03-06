# Technical Specifications

## User Class

#### Variables
- String: username
- String: email
- String: password
- String: wallet address
- Int: experience points

#### Methods
- Sign up
    - Create user
    - Connect with wallet
    - Add user to users
- Sign in
- Sign out

## Auction Class

#### Variables
- String: title
- Image: NFT
- Date: start time
- Date: end time
- Int: starting price (optional)
- Int: views
- Dictionary: bids
    - String: username
        - Date: bid time
        - Int: bid price

#### Methods
- Create auction
    - Creator has to be logged in
    - Start time has to be after now
    - End time has to be after start time
    - Add 10XP to user
- Place bid
    - Bidder has to be logged in
    - Price has to > latest auction price
    - Bid has to be at least two minutes after last bid
    - Add 10XP to bidder
    - Email notification to all bidders and creator with username and price
- Auction ends
    - Winning bidder sends bid price to creator address
    - Add 50XP to bidder and 50XP to creator (if at least 1 bid)
    - Email notification to all bidders and creator with username and price

## Database Class

#### Variables
- Array: users
- Array: auctions

#### Methods
- Display auctions
    - Viewer has to be logged in
    - Filter by active/past
    - Sort by popularity
    - Popularity = views * bids
    - Show title, NFT, duration to end time, latest price, creator XP
    - Add view to auction per click

## Priority
1. Database Class variables
2. User Class variables and methods
3. Auction Class variables and methods
4. Database Class methods