public class User extends AccountManager {
    
    public String userName;
    private int accountNumber;
    private int pin;
    private double balance;
    
    User(String userName, int accountNumber, int pin, double balance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.setBalance(balance);;
    }

    protected int getPin() {
        return pin;
    }

    protected int getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
