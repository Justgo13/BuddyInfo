public class BuddyInfo {
    private String name;
    private String address;
    private String telephone;

    public BuddyInfo(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return "Hello " + name;
    }
}
