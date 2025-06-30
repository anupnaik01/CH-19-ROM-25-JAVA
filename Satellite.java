class Satellite {
    static String satelliteName;
    static String missionType;
    static String operator;
    static int launchYear;
    static String launchSite;
    static String launchVehicle;
    static double weight;
    static String orbitType;
    static int lifespan;
    static String payload;
    static String purpose;
    static String fuelType;
    static String country;
    static String groundStation;
    static int solarPanels;
    static String communicationBand;
    static String manufacturer;
    static String transponders;
    static String status;
    static String specialFeature;

    public static void main(String args[]) {

        satelliteName = "INSAT-3DR";
        missionType = "Weather Monitoring";
        operator = "ISRO";
        launchYear = 2016;
        launchSite = "Sriharikota";
        launchVehicle = "GSLV-F05";
        weight = 2211.0;
        orbitType = "Geostationary";
        lifespan = 10;
        payload = "Imager, Sounder";
        purpose = "Meteorological Data";
        fuelType = "Hydrazine";
        country = "India";
        groundStation = "Hassan";
        solarPanels = 2;
        communicationBand = "C-band";
        manufacturer = "ISRO Satellite Centre";
        transponders = "12";
        status = "Active";
        specialFeature = "Search & Rescue Transponder";

        System.out.println("Satellite Name : " + satelliteName);
        System.out.println("Mission Type : " + missionType);
        System.out.println("Operator : " + operator);
        System.out.println("Launch Year : " + launchYear);
        System.out.println("Launch Site : " + launchSite);
        System.out.println("Launch Vehicle : " + launchVehicle);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Orbit Type : " + orbitType);
        System.out.println("Lifespan : " + lifespan + " years");
        System.out.println("Payload : " + payload);
        System.out.println("Purpose : " + purpose);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Country : " + country);
        System.out.println("Ground Station : " + groundStation);
        System.out.println("Solar Panels : " + solarPanels);
        System.out.println("Communication Band : " + communicationBand);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Transponders : " + transponders);
        System.out.println("Status : " + status);
        System.out.println("Special Feature : " + specialFeature);

        double satelliteCost = 4500.50;
        System.out.println("Satellite Estimated Cost in Crores : Rs." + satelliteCost);
    }
}
