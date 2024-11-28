package T1_JavaConstructors;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public BankAccount(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        String bankAccount;
        bankAccount = "Bank account: " + " Account Number: " + this.accountNumber + ", " +
                " Balance: " + this.balance + ", " + " Account Type: " + this.accountType;

        return bankAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

}
