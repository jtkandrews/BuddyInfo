import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        // BuddyInfo uddy = new BuddyInfo(uddy);
        buddyList.add(buddy);
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        Iterator<BuddyInfo> iterator = buddyList.iterator();
        while (iterator.hasNext()) {
            BuddyInfo bud = iterator.next();
            if (bud.getName().equals(buddy.getName())){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}




