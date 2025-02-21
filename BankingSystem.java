import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts;
    private Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public void createAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawal of " + amount + " processed for account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance for account: " + accountNumber);
            }
        }
    }

    public void displaySortedAccounts() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " - Balance: " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 7000);
        
        bank.deposit(101, 2000);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(101);
        
        bank.processWithdrawals(1000);
        bank.displaySortedAccounts();
    }
}

