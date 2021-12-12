public class TouristTicket extends Ticket{
    private String []touristLocation;
    private String HotelAddress;

    public TouristTicket(String[] touristLocation, String hotelAddress) {
        super("98765","12:45","LKO",null,"12-12-2021","1","CONFIRMED",null,"69","1000");
        this.touristLocation = touristLocation;
        HotelAddress = hotelAddress;
    }

    public String selectLocation(String []location){
        return "selected location is: ";
    }

    public boolean addOrRemoveLocation(String location){
        return false;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        HotelAddress = hotelAddress;
    }
}
