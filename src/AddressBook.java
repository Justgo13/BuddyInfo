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
}
