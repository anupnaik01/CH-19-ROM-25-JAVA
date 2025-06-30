class Stadium {
    static String stadiumName;
    static String location;
    static int seatingCapacity;
    static String sportType;
    static String surfaceType;
    static String builtYear;
    static String owner;
    static int numberOfGates;
    static String floodLight;
    static String dressingRoom;
    static String vipBox;
    static String parking;
    static String commentatorBox;
    static String scoreBoard;
    static String sponsor;
    static String nearbyStation;
    static String restroom;
    static String medicalFacility;
    static String cafeteria;
    static String maintenanceBy;

    public static void main(String args[]) {
        stadiumName = "Chinnaswamy";
        location = "Bangalore";
        seatingCapacity = 35000;
        sportType = "Cricket";
        surfaceType = "Grass";
        builtYear = "1970";
        owner = "Karnataka State";
        numberOfGates = 10;
        floodLight = "Yes";
        dressingRoom = "2 Rooms";
        vipBox = "Yes";
        parking = "Available";
        commentatorBox = "Present";
        scoreBoard = "Digital";
        sponsor = "Paytm";
        nearbyStation = "Caban Park";
        restroom = "Available";
        medicalFacility = "Yes";
        cafeteria = "Open";
        maintenanceBy = "KSCA";

        int matchTicketPrice = 1200; 
		
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + seatingCapacity);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Surface: " + surfaceType);
        System.out.println("Built Year: " + builtYear);
        System.out.println("Owner: " + owner);
        System.out.println("No. of Gates: " + numberOfGates);
        System.out.println("Flood Light: " + floodLight);
        System.out.println("Dressing Rooms: " + dressingRoom);
        System.out.println("VIP Box: " + vipBox);
        System.out.println("Parking: " + parking);
        System.out.println("Match Ticket Price: Rs." + matchTicketPrice);
        System.out.println("Commentator Box: " + commentatorBox);
        System.out.println("Score Board: " + scoreBoard);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Nearby Station: " + nearbyStation);
        System.out.println("Restroom: " + restroom);
        System.out.println("Medical: " + medicalFacility);
        System.out.println("Cafeteria: " + cafeteria);
        System.out.println("Maintained By: " + maintenanceBy);
    }
}
