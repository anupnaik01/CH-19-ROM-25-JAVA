class ShoppingMall {
    static String mallName;
    static String location;
    static int totalShops;
    static int floors;
    static String parkingAvailable;
    static String foodCourt;
    static String cinemaHall;
    static int numberOfEscalators;
    static String openingHours;
    static String closingHours;
    static String wifiAvailable;
    static String anchorStore;
    static String constructionYear;
    static String kidsZone;
    static String playArea;
    static int totalEmployees;
    static String mallOwner;
    static String gymFacility;
    static String fireSafety;
    static double averageFootfall;

    public static void main(String args[]) {

        mallName = "Orion Mall";
        location = "Bangalore";
        totalShops = 250;
        floors = 5;
        parkingAvailable = "Yes";
        foodCourt = "Yes";
        cinemaHall = "Yes";
        numberOfEscalators = 20;
        openingHours = "10 AM";
        closingHours = "10 PM";
        wifiAvailable = "Yes";
        anchorStore = "Lifestyle";
        constructionYear = "2010";
        kidsZone = "Yes";
        playArea = "Yes";
        totalEmployees = 500;
        mallOwner = "Orion Group";
        gymFacility = "Yes";
        fireSafety = "Yes";
        averageFootfall = 5000.0;

        System.out.println("Main Started");
        System.out.println("Mall Name: " + mallName);
        System.out.println("Location: " + location);
        System.out.println("Total Shops: " + totalShops);
        System.out.println("Floors: " + floors);
        System.out.println("Parking Available: " + parkingAvailable);
        System.out.println("Food Court: " + foodCourt);

        int mallRent = 150000;
        System.out.println("Monthly Mall Rent for Store: Rs." + mallRent);

        System.out.println("Cinema Hall: " + cinemaHall);
        System.out.println("Number Of Escalators: " + numberOfEscalators);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Closing Hours: " + closingHours);
        System.out.println("WiFi Available: " + wifiAvailable);
        System.out.println("Anchor Store: " + anchorStore);
        System.out.println("Construction Year: " + constructionYear);
        System.out.println("Kids Zone: " + kidsZone);
        System.out.println("Play Area: " + playArea);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Mall Owner: " + mallOwner);
        System.out.println("Gym Facility: " + gymFacility);
        System.out.println("Fire Safety: " + fireSafety);
        System.out.println("Average Footfall: " + averageFootfall);
        System.out.println("Main Ended");
    }
}
