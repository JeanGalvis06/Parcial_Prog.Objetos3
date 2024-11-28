package T1_T14_JavaConstructors;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountType;

    //Constructor por defecto.
    public BankAccount() {
    }

    //Constructor parametrizado.
    public BankAccount(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    //Sobrecarga de constructores.
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
