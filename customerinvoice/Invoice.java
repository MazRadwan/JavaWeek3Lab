package customerinvoice;
public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    //constructor
    public Invoice(int ID, Customer customer, double amount)
    {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    // getter for id
    public int getID()
    {
        return ID;
    }
    // getter for customer
    public Customer getCustomer()
    {
        return customer;
    }
    // setter for customer
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    // getter for amount
    public double getAmount()
    {
        return amount;
    }
    // setter for amount
    public void setAmount(double amount)

    {
        this.amount = amount;
    }

    //method to get customer name
    public String getCustomerName()
    {
        return customer.getName();
    }
    // method to get amount after discount
    public double getAmountAfterDiscount()
    {
        return amount - (amount * customer.getDiscount() / 100);
    }
    public String toString()
    {
        return "Invoice[id=" + ID + ",customer=" + customer + ",amount=" + amount + "]";
    }
}
