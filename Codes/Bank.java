import java.util.Scanner;

abstract class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void displayBalance();

    abstract void computeInterest();

    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void computeInterest() {
        double interestRate = 0.05;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

class CurrentAccount extends Account {
    double minimumBalance = 1000;
    double serviceCharge = 50;

    CurrentAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void computeInterest() {
        System.out.println("Current account does not earn interest");
    }

    void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient balance");
            balance -= serviceCharge;
            System.out.println("Service charge: " + serviceCharge);
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

class Brun {
    public static void main(String[] args) {

        System.out.println("NAME: HARSHITH B");
        System.out.println("USN:  2023BMS02519\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account type (savings/current): ");
        String accountType = sc.next();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account;
        if (accountType.equals("savings")) {
            account = new SavingsAccount(customerName, accountNumber, accountType, balance);
        } else {
            account = new CurrentAccount(customerName, accountNumber, accountType, balance);
        }

        System.out.println("\n###-MENU-###");
        System.out.println("1. Deposit");
        System.out.println("2. Display balance");
        System.out.println("3. Compute interest");
        System.out.println("4. Withdraw");
        System.out.println("5. Exit\n");

        while (true) {
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter amount to deposit: ");
                    double amount = sc.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    account.computeInterest();
                    break;
                case 4:
                    System.out.print("\nEnter amount to withdraw: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}
