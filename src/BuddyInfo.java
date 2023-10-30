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

    @Override
    public String toString(){
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        BuddyInfo buddy = (BuddyInfo) obj;
        return phoneNumber == buddy.phoneNumber &&
                name.equals(buddy.name) &&
                address.equals(buddy.address);
    }


/*    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("Homer",  "574 Airport", 807);
        System.out.println("Hello " + Homer.getName());
    }*/
}
