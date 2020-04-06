package arrayList.modileProject;

public class ContactList {
    private String contactName;
    private int phoneNumber;

    public ContactList(String contactName, int phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "" + contactName + ", Phone Number: " + phoneNumber;
    }
}
