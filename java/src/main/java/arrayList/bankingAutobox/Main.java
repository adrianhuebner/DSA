package arrayList.bankingAutobox;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Olive", 10000.00);
        bank.addCustomer("Adelaide", "Alley", 1000.00);
        bank.addCustomer("Adelaide", "Maggie", 10000.00);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Pip", 10000.00);

        bank.addCustomerTransaction("Adelaide", "Olive", 1000.50);
        bank.addCustomerTransaction("Adelaide", "Olive", 10000.50);
        bank.addCustomerTransaction("Adelaide", "Maggie", 1000.50);
        bank.addCustomerTransaction("Adelaide", "Maggie", 10000.50);

        bank.addCustomerTransaction("Sydney", "Pip", 100000.75);

        bank.listAllCustomers("Adelaide", true);
    }
}
