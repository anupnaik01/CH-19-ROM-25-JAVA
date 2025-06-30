class VideoGames {
    static String gameTitle;
    static String genre;
    static String platform;
    static String developer;
    static String publisher;
    static int releaseYear;
    static String graphicsQuality;
    static int ageRating;
    static String singlePlayer;
    static String multiPlayer;
    static String gameMode;
    static double gameSize;
    static String controllerSupport;
    static String soundtrack;
    static String languageSupport;
    static String inAppPurchase;
    static int price;
    static String website;
    static String gameEngine;

    public static void main(String args[]) {

        gameTitle = "Valorant";
        genre = "Tactical Shooter";
        platform = "PC";
        developer = "Riot Games";
        publisher = "Riot Games";
        releaseYear = 2020;
        graphicsQuality = "High";
        ageRating = 16;
        singlePlayer = "No";
        multiPlayer = "Yes";
        gameMode = "Competitive, Spike Rush, Deathmatch";
        gameSize = 25.6;
        controllerSupport = "No";
        soundtrack = "Original";
        languageSupport = "English";
        inAppPurchase = "Yes";
        price = 0;
        website = "playvalorant.com";
        gameEngine = "Unreal Engine 4";

        System.out.println("Game Title: " + gameTitle);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Developer: " + developer);
        System.out.println("Publisher: " + publisher);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Graphics Quality: " + graphicsQuality);
        System.out.println("Age Rating: " + ageRating);

        int premiumSkinCost = 899; 
        System.out.println("Premium Skin Cost: Rs." + premiumSkinCost);

        System.out.println("Single Player: " + singlePlayer);
        System.out.println("Multiplayer: " + multiPlayer);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("Size: " + gameSize + " GB");
        System.out.println("Controller Support: " + controllerSupport);
        System.out.println("Soundtrack: " + soundtrack);
        System.out.println("Languages: " + languageSupport);
        System.out.println("In-App Purchase: " + inAppPurchase);
        System.out.println("Price: Rs." + price);
        System.out.println("Website: " + website);
        System.out.println("Engine: " + gameEngine);
    }
}
