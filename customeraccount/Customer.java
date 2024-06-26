package customeraccount;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    //constructor
    public Customer(int ID, String name, char gender)
    {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
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
    public char getGender()
    { 
        return gender;
    }

    // toString
    public String toString()
    {
        return name + "(" + ID + ")";
    }
    
}
