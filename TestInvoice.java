import customerinvoice.Customer;
import customerinvoice.Invoice;

public class TestInvoice {
    public static void main(String [] args) 
    {
        Customer customer = new Customer (1, "Peter Park", 10);

        //create an invoice instance
        Invoice invoice = new Invoice(101, customer, 200.0);


        //test getters
        System.out.println("Invoice ID is: " + invoice.getID());
        System.out.println("Customer : " + invoice.getCustomer());
        System.out.println("Invoice amount: " + invoice.getAmount());

        // test setAmount
        invoice.setAmount(250.0);
        System.out.println("Updated invoice amount: " + invoice.getAmount());

        // test getcustomerName
        System.out.println("Customer name: " + invoice.getCustomerName());

        // test getAmountAfterDiscount
        System.out.println("Amount after discount: " + invoice.getAmountAfterDiscount());

        // test toString
        System.out.println("Invoice: " + invoice);
    }
}   