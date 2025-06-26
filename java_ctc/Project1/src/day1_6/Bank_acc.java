package day1_6;

import java.util.Scanner;

public class Bank_acc {
    private int accnum;
    private String cname;
    private int bal;
    private String city;

    // Default Constructor
    public Bank_acc() {
        accnum = 0;
        cname = "";
        bal = 0;
        city = "";
    }

    // Parameterized Constructor
    public Bank_acc(int accnum, String cname, int bal, String city) {
        this.accnum = accnum;
        this.cname = cname;
        this.bal = bal;
        this.city = city;
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accnum = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();
        System.out.print("Enter City: ");
        city = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        bal = sc.nextInt();
    }

    public void deposit(int amount) {
        bal += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(int amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Bank_acc toAcc, int amount) {
        if (amount <= bal) {
            this.bal -= amount;
            toAcc.bal += amount;
            System.out.println("Amount transferred successfully.");
        } else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accnum);
        System.out.println("Customer Name: " + cname);
        System.out.println("City: " + city);
        System.out.println("Balance: " + bal);
        System.out.println("------------------------");
    }

    public void display(String searchCity) {
        if (this.city.equalsIgnoreCase(searchCity)) {
            display();
        }
    }

    public void display(int searchAcc) {
        if (this.accnum == searchAcc) {
            display();
        }
    }

    public int getAccnum() {
        return accnum;
    }

    // Main Method with Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_acc[] accArr = new Bank_acc[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Search by City");
            System.out.println("7. Search by Account Number");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < accArr.length) {
                        accArr[count] = new Bank_acc();
                        accArr[count].create();
                        count++;
                    } else {
                        System.out.println("Account limit reached.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        accArr[i].display();
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    int dAcc = sc.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    int damt = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (accArr[i].getAccnum() == dAcc) {
                            accArr[i].deposit(damt);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    int wAcc = sc.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    int wamt = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (accArr[i].getAccnum() == wAcc) {
                            accArr[i].withdraw(wamt);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter From Account Number: ");
                    int from = sc.nextInt();
                    System.out.print("Enter To Account Number: ");
                    int to = sc.nextInt();
                    System.out.print("Enter Amount to Transfer: ");
                    int tamt = sc.nextInt();
                    Bank_acc fromAcc = null, toAcc = null;
                    for (int i = 0; i < count; i++) {
                        if (accArr[i].getAccnum() == from) fromAcc = accArr[i];
                        if (accArr[i].getAccnum() == to) toAcc = accArr[i];
                    }
                    if (fromAcc != null && toAcc != null) {
                        fromAcc.transfer(toAcc, tamt);
                    } else {
                        System.out.println("Invalid account(s).");
                    }
                    break;
                case 6:
                    System.out.print("Enter City: ");
                    sc.nextLine(); // consume newline
                    String c = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        accArr[i].display(c);
                    }
                    break;
                case 7:
                    System.out.print("Enter Account Number: ");
                    int a = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        accArr[i].display(a);
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}
