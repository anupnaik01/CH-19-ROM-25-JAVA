class Desktop {
    static String brand;
    static String model;
    static String processor;
    static int ramSize;
    static int storageSize;
    static String storageType;
    static String graphicsCard;
    static String os;
    static String color;
    static String weight;
    static String dimensions;
    static double price;
    static String warranty;
    static String manufacturingDate;
    static String powerSupply;
    static int usbPorts;
    static String dvdDrive;
    static String keyboardIncluded;
    static String mouseIncluded;
    static String monitorSize;

    public static void main(String args[]) {

        brand = "hp";
        model = "Pavilion";
        processor = "Ryzen 5";
        ramSize = 16;
        storageSize = 512;
        storageType = "SSD";
        graphicsCard = "NVIDIA GTX";
        os = "Windows 11";
        color = "Black";
        weight = "2.5kg";
        dimensions = "40x20x45 cm";
        price = 65000.0;
        warranty = "3 Years";
        manufacturingDate = "15-04-2023";
        powerSupply = "150W";
        usbPorts = 4;
        dvdDrive = "Not Available";
        keyboardIncluded = "Yes";
        mouseIncluded = "Yes";
        monitorSize = "21 inches";

        System.out.println("Main Started");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");

        double desktopDiscountPrice = 59999.0;
        System.out.println("Discount Price: Rs." + desktopDiscountPrice);

        System.out.println("Storage Type: " + storageType);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + os);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Price: Rs." + price);
        System.out.println("Warranty: " + warranty);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("DVD Drive: " + dvdDrive);
        System.out.println("Keyboard Included: " + keyboardIncluded);
        System.out.println("Mouse Included: " + mouseIncluded);
        System.out.println("Monitor Size: " + monitorSize);
        System.out.println("Main Ended");
    }
}
