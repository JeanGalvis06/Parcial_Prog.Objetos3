
package T5_PublicAccessModifier;

public class BankAccount {
    private String numberAccount;
    private double balance;
    public String typeAccount;

    public BankAccount() {
    }

    

    public BankAccount(String numberAccount, double balance, String typeAccount) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }


    public void showInfo(){
        System.out.println("Number Account: " + numberAccount + ", " + "Balance: " + balance + ", " + "type Account" + typeAccount);
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    
    
}
