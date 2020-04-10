package arrayList.bankingAutobox;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    private Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        System.out.println(customerName + " already exists");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
       Customer existingCustomer = findCustomer(customerName);
       if(existingCustomer != null){
           existingCustomer.addTransaction(amount);
           return true;
       }
        System.out.println(customerName + " was not found");
       return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
