class PoliceStation {
    static String name;
    static String address;
    static String contactNo;
    static String headConstable;
    static int totalPolice;
    static int prisonerCells;
    static String established;
    static String type;
    static int filedCases;
    static int pendingCases;
    static String stationCode;
    static String emailId;
    static int jeep;
    static String specialUnit;
    static int womenStaff;
    static String openTimings;
    static String district;
    static String dutyOfficer;
    static String facility;
    static String helpLine;

    public static void main(String args[]) {

        name = "Central Police Station";
        address = "Main Street, Banglore";
        contactNo = "080-1234567";
        headConstable = "Mr.Kumar";
        totalPolice = 60;
        prisonerCells = 5;
        established = "1990";
        type = "City Station";
        filedCases = 800;
        pendingCases = 150;
        stationCode = "CPSB001";
        emailId = "central@police.in";
        jeep = 4;
        specialUnit = "Anti Drug Squad";
        womenStaff = 12;
        openTimings = "24/7";
        district = "Banglore District";
        dutyOfficer = "SI Kamat";
        facility = "Cyber Cell";
        helpLine = "100";

        System.out.println("Main Started");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactNo);
        System.out.println("Head Constable: " + headConstable);
        System.out.println("Total Police Staff: " + totalPolice);

        int fineAmount = 500; 
        System.out.println("Fine Amount for No Helmet: Rs." + fineAmount);
		
		fineAmount = 1000; 
        System.out.println("Fine Amount for No SeatBealt: Rs." + fineAmount);

        System.out.println("Prisoner Cells: " + prisonerCells);
        System.out.println("Established: " + established);
        System.out.println("Type: " + type);
        System.out.println("Cases Filed: " + filedCases);
        System.out.println("Pending Cases: " + pendingCases);
        System.out.println("Station Code: " + stationCode);
        System.out.println("Email: " + emailId);
        System.out.println("Jeeps Available: " + jeep);
        System.out.println("Special Unit: " + specialUnit);
        System.out.println("Women Staff: " + womenStaff);
        System.out.println("Open Timings: " + openTimings);
        System.out.println("District: " + district);
        System.out.println("Duty Officer: " + dutyOfficer);
        System.out.println("Facility: " + facility);
        System.out.println("Help Line: " + helpLine);
        System.out.println("Main Ended");
    }
}
