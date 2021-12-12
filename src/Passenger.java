public class Passenger {

    private static int uniqueId;
    private String name ;
    private Address address;
    private Contact contact;
    private Ticket ticket;


    public Passenger(String name, Address address, Contact contact, Ticket ticket) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.ticket = ticket;
        uniqueId++;
    }

    public Contact getContact(String id){
        return new Contact();
    }
    public String updateContact(String id){
        return "Update the passanger";
    }
    public int getPassengerCount(){
        return uniqueId;
    }

    public static int getUniqueId() {
        return uniqueId;
    }

    public static void setUniqueId(int uniqueId) {
        Passenger.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
