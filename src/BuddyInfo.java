public class BuddyInfo {


    private String name;
    private String address;
    private int phoneNumber;
    public BuddyInfo() {
    }
    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("Homer",  "574 Airport", 807);
        System.out.println("Hello " + Homer.getName());
    }
}
