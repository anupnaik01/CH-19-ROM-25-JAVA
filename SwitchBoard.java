class SwitchBoard {
    static String switchBoardBrand;
    static int totalSwitch;
    static String colour;
    static String materialType;
    static int price;
    static String dealer;
    static int socketCount;
    static String model;
    static String manufactureDate;
    static String companyOrigin;
    static String warrantyPeriod;
    static String voltage;
    static int weight;
    static String dimension;
    static String certification;
    static String type;
    static int switchLife;
    static String indicator;
    static String usageType;
    static String power;

    public static void main(String args[]) {

        switchBoardBrand = "Havells";
        totalSwitch = 6;
        colour = "Off White";
        materialType = "Plastic";
        price = 1200;
        dealer = "Naik Electricals";
        socketCount = 4;
        model = "SW2022";
        manufactureDate = "11-05-2022";
        companyOrigin = "India";
        warrantyPeriod = "1 Year";
        voltage = "230V";
        weight = 350;
        dimension = "12x8 inches";
        certification = "ISI";
        type = "Modular";
        switchLife = 20;
        indicator = "Red LED";
        usageType = "Home";
        power = "15A";

        System.out.println("Main Started");
        System.out.println("Brand: " + switchBoardBrand);
        System.out.println("Total Switches: " + totalSwitch);
        System.out.println("Colour: " + colour);
        System.out.println("Material: " + materialType);

        int switchPriceOffer = 999;
        System.out.println("Offer Price for Dealers: Rs." + switchPriceOffer);

        System.out.println("Price: Rs." + price);
        System.out.println("Dealer: " + dealer);
        System.out.println("Sockets: " + socketCount);
        System.out.println("Model: " + model);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Made In: " + companyOrigin);
        System.out.println("Warranty: " + warrantyPeriod);
        System.out.println("Voltage Supported: " + voltage);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Dimension: " + dimension);
        System.out.println("Certification: " + certification);
        System.out.println("Type: " + type);
        System.out.println("Switch Life: " + switchLife + " years");
        System.out.println("Indicator Type: " + indicator);
        System.out.println("Usage: " + usageType);
        System.out.println("Power: " + power);
        System.out.println("Main Ended");
    }
}
