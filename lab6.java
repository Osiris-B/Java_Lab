import java.util.Scanner;

class Bank {
    protected String name;
    protected long accountNumber;
    protected double balance;
    public int year;

    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        this.name = sc.nextLine();
        System.out.println("Enter Account Number:");
        this.accountNumber = sc.nextLong();
        System.out.println("Enter Balance:");
        this.balance = sc.nextDouble();
        System.out.println("Enter the year:");
        this.year = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Year: " + year);
    }

    public void calculateInterest() {
        System.out.println("Interest Calculation: Base Class");
    }
}

class CityBank extends Bank {
    private double interestRate;

    public void readDetails() {
        super.readDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interest Rate for City Bank:");
        this.interestRate = sc.nextDouble();
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest earned at City Bank: " + interest);
    }
}

class SBIBank extends Bank {
    private double interestRate;

    public void readDetails() {
        super.readDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interest Rate for SBI Bank:");
        this.interestRate = sc.nextDouble();
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest earned at SBI Bank: " + interest);
    }
}

class CanaraBank extends Bank {
    private double interestRate;

    public void readDetails() {
        super.readDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interest Rate for Canara Bank:");
        this.interestRate = sc.nextDouble();
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest earned at Canara Bank: " + interest);
    }
}

public class lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CityBank[] cityBanks = new CityBank[3];
        SBIBank[] sbiBanks = new SBIBank[3];
        CanaraBank[] canaraBanks = new CanaraBank[3];

        System.out.println("Enter the details for City Bank: ");
        for (int i = 0; i < sbiBanks.length; i++) {
            sbiBanks[i] = new SBIBank();
            sbiBanks[i].readDetails();
        }

        System.out.println("\nEnter details for Canara Bank:");
        for (int i = 0; i < canaraBanks.length; i++) {
            canaraBanks[i] = new CanaraBank();
            canaraBanks[i].readDetails();
        }

        System.out.println("\nCity Banks Details:");
        for (CityBank cityBank : cityBanks) {
            cityBank.displayDetails();
            cityBank.calculateInterest();
        }

        System.out.println("\nSBI Bank Details:");
        for (SBIBank sbiBank : sbiBanks) {
            sbiBank.displayDetails();
            sbiBank.calculateInterest();
        }

        System.out.println("\nCanara Bank Details:");
        for (CanaraBank canaraBank : canaraBanks) {
            canaraBank.displayDetails();
            canaraBank.calculateInterest();
        }

        double maxInterest = 0;
        SBIBank highestInterestCustomer = null;
        System.out.println("Enter the year you want to see the highest interest:");
        int y = sc.nextInt();

        for (SBIBank sbiBank : sbiBanks) {
            if (sbiBank.getInterestEarned() > maxInterest && sbiBank.year == y) {
                maxInterest = sbiBank.getInterestEarned();
                highestInterestCustomer = sbiBank;
            }
        }
        if (highestInterestCustomer != null) {
            System.out.println("\nCustomer with the highest interest in SBI Bank:");
            highestInterestCustomer.displayDetails();
        } else {
            System.out.println("\nNo customers in SBI Bank.");
        }
        sc.close();
    }
}
