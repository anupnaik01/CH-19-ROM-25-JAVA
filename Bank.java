class Bank {
    static String bankName;
    static String branch;
    static String location;
    static String ifscCode;
    static String micrCode;
    static String establishedYear;
    static String bankType;
    static int totalEmployees;
    static String branchManager;
    static String atmAvailable;
    static String lockerFacility;
    static double interestRateSavings;
    static int totalAccounts;
    static double minBalance;
    static String headOffice;
    static int totalLoans;
    static double netProfit;
    static int noOfATMs;
    static String customerCareNo;
    static String website;

    public static void main(String args[]) {

        bankName = "SBI";
        branch = "Sahakara Nagar";
        location = "Bangalore";
        ifscCode = "SBIN0001234";
        micrCode = "560002005";
        establishedYear = "1955";
        bankType = "Public";
        totalEmployees = 120;
        branchManager = "Mr. Mukesh";
        atmAvailable = "Yes";
        lockerFacility = "Yes";
        interestRateSavings = 3.5;
        totalAccounts = 50000;
        minBalance = 1000.0;
        headOffice = "Mumbai";
        totalLoans = 5000;
        netProfit = 25000000.0;
        noOfATMs = 25;
        customerCareNo = "1800-123-456";
        website = "www.sbi.co.in";

        System.out.println("Main Started");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("Location: " + location);
        System.out.println("IFSC Code: " + ifscCode);

        String bankDepositScheme = "Fixed Deposit"; 
        System.out.println("Popular Deposit Scheme: " + bankDepositScheme);

        System.out.println("MICR Code: " + micrCode);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Bank Type: " + bankType);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Branch Manager: " + branchManager);
        System.out.println("ATM Available: " + atmAvailable);
        System.out.println("Locker Facility: " + lockerFacility);
        System.out.println("Interest Rate on Savings: " + interestRateSavings + "%");
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Minimum Balance: Rs." + minBalance);
        System.out.println("Head Office: " + headOffice);
        System.out.println("Total Loans: " + totalLoans);
        System.out.println("Net Profit: Rs." + netProfit);
        System.out.println("Number of ATMs: " + noOfATMs);
        System.out.println("Customer Care No: " + customerCareNo);
        System.out.println("Website: " + website);
        System.out.println("Main Ended");
    }
}
