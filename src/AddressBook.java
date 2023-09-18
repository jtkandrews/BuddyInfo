import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }
    public void addBuddy(String name, String address, int phoneNumber){
        BuddyInfo buddy = new BuddyInfo(name, address, phoneNumber);
        buddyList.add(buddy);
    }

    public boolean removeBuddy(String name) {
        Iterator<BuddyInfo> iterator = buddyList.iterator();
        while (iterator.hasNext()) {
            BuddyInfo buddy = iterator.next();
            if (buddy.getName().equals(name)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}




