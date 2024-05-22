package customeraccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    // constructor with balance
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    // constructor w/o balance 
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    // getters
    public int getID() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    // setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //method to get customer name
    public String getCustomerName() {
        return customer.getName();
    }
    // method to deposit
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }
    // method to withdraw
    public Account withdraw(double amount)
     {
        if(balance >= amount){
            this.balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
    public String toString() {
        return customer.toString() + " Balance= $" + String.format("%.2f", balance);
    }
}
