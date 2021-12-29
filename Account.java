public class Main {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20000);
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500.0);
        ac.deposit(3000.0);
        System.out.println("Balance: $" + ac.getBalance());
        System.out.println("Monthly Interest: " + ac.getMonthlyInterest());
        System.out.println("Date Created: " + ac.getDateCreated());
    }
}
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
}