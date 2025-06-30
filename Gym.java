class Gym {
    static String gymName;
    static String location;
    static int totalEquipments;
    static String openingTime;
    static String closingTime;
    static String membershipType;
    static int membersCount;
    static String trainerName;
    static int treadmillCount;
    static String gymArea;
    static int dumbbellsCount;
    static String cardioSection;
    static String weightSection;
    static String steamAvailable;
    static String lockerAvailable;
    static String parkingFacility;
    static int yogaMats;
    static String paymentMode;
    static String contactNumber;
    static String establishedYear;

    public static void main(String args[]) {

        gymName = "FitZone";
        location = "Sahakar Nagar";
        totalEquipments = 35;
        openingTime = "6 AM";
        closingTime = "10 PM";
        membershipType = "Monthly";
        membersCount = 150;
        trainerName = "Mr.Guru";
        treadmillCount = 5;
        gymArea = "2500 sq.ft";
        dumbbellsCount = 20;
        cardioSection = "Yes";
        weightSection = "Yes";
        steamAvailable = "No";
        lockerAvailable = "Yes";
        parkingFacility = "Yes";
        yogaMats = 10;
        paymentMode = "Online & Cash";
        contactNumber = "9988776655";
        establishedYear = "2015";

        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Total Equipments: " + totalEquipments);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Membership Type: " + membershipType);

        int monthlyFee = 1200;
        System.out.println("Monthly Membership Fee: Rs." + monthlyFee);
		
		monthlyFee = 7000;
        System.out.println("6 Month Membership Fee: Rs." + monthlyFee);

        System.out.println("Members Count: " + membersCount);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Treadmills: " + treadmillCount);
        System.out.println("Gym Area: " + gymArea);
        System.out.println("Dumbbells: " + dumbbellsCount);
        System.out.println("Cardio Section: " + cardioSection);
        System.out.println("Weight Section: " + weightSection);
        System.out.println("Steam Facility: " + steamAvailable);
        System.out.println("Locker Facility: " + lockerAvailable);
        System.out.println("Parking: " + parkingFacility);
        System.out.println("Yoga Mats: " + yogaMats);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Established Year: " + establishedYear);
    }
}
