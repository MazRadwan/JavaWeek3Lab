package customerinvoice;
public class Customer {
    private int ID;
    private String name;
    private int discount;

    //consructor
    public Customer(int ID, String name, int discount)
    {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    //getters
    public int getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public int getDiscount()
    {
        return discount;
    }

    //setter
    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
    // t0String
    public String toString()
    {
        return name + "(" + ID + ")";   
    }
}