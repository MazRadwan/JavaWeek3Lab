import customerinvoice.Customer;

public class TestCustomer {
    public static void main(String [] args) 
    {
        Customer customer = new Customer(1, "Peter Parker",10);
  

    //test getters
    System.out.println("Customer ID is: " + customer.getID());  
    System.out.println("Customer name is: " + customer.getName());
    System.out.println("Customer discount is: " + customer.getDiscount());

    //test setters for discount
    customer.setDiscount(15);
    System.out.println("Updated customer discount is: " + customer.getDiscount());

    // test toString()
    System.out.println("Customer: " + customer);

    }
}