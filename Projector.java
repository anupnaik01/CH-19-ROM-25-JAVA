class Projector {
    static String company;
    static String modelName;
    static String displayType;
    static int brightnessLevel;
    static String supportedResolution;
    static String colorBody;
    static String connectivity;
    static String lampDuration;
    static String projectorSize;
    static String coolingType;
    static int warrantyYears;
    static int price;
    static String aspectRatioSupport;
    static int weight;
    static String projectionDistance;
    static String audioSupport;
    static String packageContent;
    static String madeInCountry;
    static String inputPorts;
    static String maintenanceTips;

    public static void main(String args[]) {

        company = "BenQ";
        modelName = "TK800M";
        displayType = "DLP";
        brightnessLevel = 3000;
        supportedResolution = "4K UHD";
        colorBody = "White";
        connectivity = "HDMI, USB";
        lampDuration = "4000 Hours";
        projectorSize = "Medium";
        coolingType = "Air Cooled";
        warrantyYears = 3;
        price = 75000;
        aspectRatioSupport = "16:9";
        weight = 3;
        projectionDistance = "1.5m to 4m";
        audioSupport = "Built-in Speaker";
        packageContent = "Remote, Cables";
        madeInCountry = "China";
        inputPorts = "2 HDMI, 1 USB";
        maintenanceTips = "Clean lens monthly";

        System.out.println("Main Started");
        System.out.println("Brand: " + company);
        System.out.println("Model: " + modelName);
        System.out.println("Display Type: " + displayType);
        System.out.println("Brightness: " + brightnessLevel + " lumens");
        System.out.println("Resolution: " + supportedResolution);
        System.out.println("Body Color: " + colorBody);

        int discountPrice = 68000;
        System.out.println("Discount Price: Rs." + discountPrice);

        System.out.println("Connectivity: " + connectivity);
        System.out.println("Lamp Life: " + lampDuration);
        System.out.println("Size: " + projectorSize);
        System.out.println("Cooling: " + coolingType);
        System.out.println("Warranty: " + warrantyYears + " Years");
        System.out.println("Price: Rs." + price);
        System.out.println("Aspect Ratio: " + aspectRatioSupport);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Projection Distance: " + projectionDistance);
        System.out.println("Audio: " + audioSupport);
        System.out.println("Box Contains: " + packageContent);
        System.out.println("Made In: " + madeInCountry);
        System.out.println("Input Ports: " + inputPorts);
        System.out.println("Maintenance: " + maintenanceTips);
        System.out.println("Main Ended");
    }
}
