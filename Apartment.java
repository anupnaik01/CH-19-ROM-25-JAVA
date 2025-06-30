class Apartment {
    static String apartmentName;
    static int totalFlats;
    static int floors;
    static String liftAvailable;
    static String location;
    static String security;
    static String swimmingPool;
    static String gymFacility;
    static String playArea;
    static String carParking;
    static String builderName;
    static String constructionYear;
    static int maintenanceCharge;
    static String waterSupply;
    static String powerBackup;
    static int numberOfLifts;
    static String apartmentType;
    static String communityHall;
    static int cctvCameras;
    static String wasteManagement;

    public static void main(String args[]) {
        apartmentName = "The Grove";
        totalFlats = 80;
        floors = 8;
        liftAvailable = "Yes";
        location = "Kodigehalli";
        security = "24x7";
        swimmingPool = "Available";
        gymFacility = "Available";
        playArea = "Yes";
        carParking = "Available";
        builderName = "Prestige Builders";
        constructionYear = "2012";
        maintenanceCharge = 2500;
        waterSupply = "Cauvery + Borewell";
        powerBackup = "Generator";
        numberOfLifts = 2;
        apartmentType = "2BHK, 3BHK";
        communityHall = "Yes";
        cctvCameras = 12;
        wasteManagement = "Implemented";

        System.out.println("Apartment Name is " + apartmentName);
        System.out.println("Apartment Location is " + location);
        System.out.println("Total Flats are " + totalFlats);
        System.out.println("Total Floors are " + floors);
        System.out.println("Lift Available : " + liftAvailable);
        System.out.println("Security : " + security);
        System.out.println("Swimming Pool : " + swimmingPool);
        System.out.println("Gym Facility : " + gymFacility);
        System.out.println("Play Area : " + playArea);
        System.out.println("Car Parking : " + carParking);
        System.out.println("Builder Name : " + builderName);
        System.out.println("Construction Year : " + constructionYear);
        System.out.println("Maintenance Charge Rs." + maintenanceCharge);
        System.out.println("Water Supply : " + waterSupply);
        System.out.println("Power Backup : " + powerBackup);
        System.out.println("Number of Lifts : " + numberOfLifts);
        System.out.println("Apartment Type : " + apartmentType);
        System.out.println("Community Hall : " + communityHall);
        System.out.println("CCTV Cameras Count : " + cctvCameras);
        System.out.println("Waste Management : " + wasteManagement);

        int apartmentPrice = 6500000;
        System.out.println("Apartment Price for 2BHK : Rs." + apartmentPrice);

        apartmentPrice = 8500000;
        System.out.println("Apartment Price for 3BHK : Rs." + apartmentPrice);
    }
}
