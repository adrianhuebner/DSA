# ArrayList Study

## Grocery List Application

- To get used to what an ArrayList is and how it operates, I am creating a grocery list application
- Methods that have been created:
   - Add an item
   - Printing out the list
   - Modifying a single item in the grocery list
   - Deleting an item from the grocery list
   - Find an item in the grocery list
   
## Simple Mobile Phone 

- Create a program that implements a simple mobile phone, it needs to do the following:
    - Able to store, modify, remove and query contact names
    - Master class called MobilePhone, that holds the ArrayList of Contacts
    - Create a simple class for Contacts (name and phone number)
    - Menu options:
        - Quit
        - Print list of contacts
        - Add New Contact
        - Update existing contact
            - When adding and updating contacts, make sure that the contact exists (use name)
        - Remove contact
        - Search/find contacts
    - ArrayList inner workings should not be exposed to MobilePhone
        - e.g. no ints, no .get(i), etc
    - MobilePhone should do everything with Contact objects only
        
## Banking Application (using Autoboxing and Unboxing)

- Create a simple banking application, it needs to have/do the following:
    - Have a Bank Class
    - It should have an ArrayList of Branches
        - Each Branch should have an ArrayList of Customers
    - Customer class should have an ArrayList of Doubles (transactions)
    - **Customer**
        - Name, and ArrayList of doubles
    - **Branch**
        - Need to be able to add new customer and initial transaction amount
        - Also needs to add additional transactions for that customer/branch
    - **Bank**
        - Add a new Branch
        - Add a new Customer to that Branch with initial transaction
        - Add a transaction for an existing customer for that branch
        - Show a list of Customers for a particular Branch and optionally a list of their transactions
    - Demonstrate Autoboxing and Unboxing in code
        - Hint: Transactions
    - Add data validation
        - Check if exists or does not exist    
        
   