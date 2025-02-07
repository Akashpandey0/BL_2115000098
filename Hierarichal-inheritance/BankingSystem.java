class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount); // Use the superclass withdraw for basic logic
        } else {
            System.out.println("Withdrawal exceeds limit.");
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term; // in months

    public FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a fixed deposit account before maturity.");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Term: " + term + " months");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 0.05);
        CheckingAccount checking = new CheckingAccount("CA001", 500, 200);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FA001", 5000, 12);

        savings.displayAccountType();
        savings.displayAccountInfo();
        savings.calculateInterest();
        savings.displayAccountInfo(); // Show updated balance
        System.out.println("--------------------");

        checking.displayAccountType();
        checking.displayAccountInfo();
        checking.withdraw(300);
        checking.displayAccountInfo();
        checking.withdraw(300); // Exceeds limit
        System.out.println("--------------------");

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountInfo();
        fixedDeposit.withdraw(100); // Cannot withdraw
        System.out.println("--------------------");



        //Polymorphism Example:
        BankAccount myAccount;

        myAccount = savings;
        myAccount.displayAccountInfo();
        System.out.println("--------------------");

        myAccount = checking;
        myAccount.displayAccountInfo();
        System.out.println("--------------------");

        myAccount = fixedDeposit;
        myAccount.displayAccountInfo();
        System.out.println("--------------------");

    }
}