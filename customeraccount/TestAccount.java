package customeraccount;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Peter Parker", 'm');
        Account account = new Account(101, customer, 500.0);

        System.out.println("Account ID" + account.getID());
        System.out.println("Customer: " + account.getCustomer());
        System.out.println("Account balance: " + account.getBalance());

        account.setBalance(750.0);
        System.out.println("Updated account balance: " + account.getBalance());

        System.out.println("Customer name: " + account.getCustomerName());

        account.deposit(250.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1000.0); // should cause an overdraft notifvcation & not withdraw

        System.out.println("Account: " + account);

    }
    
}
