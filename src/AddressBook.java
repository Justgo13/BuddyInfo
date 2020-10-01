import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfo;

    public AddressBook() {
        this.buddyInfo = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyObj) {
        buddyInfo.add(buddyObj);
    }

    public void removeBuddy(BuddyInfo buddyObj) {
        buddyInfo.remove(buddyObj);
    }

    public static void testMethod() {
        System.out.println("testing branch");
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Jason", "Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(buddyInfo);
        testMethod();
    }
}
//This is a change made on GitHub
