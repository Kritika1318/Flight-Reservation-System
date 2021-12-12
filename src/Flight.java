public class Flight {
    private String flightNumber;
    private String flightAirline;
    private int capacityOfFlight;
    private int seatsBooked;
    private RegularTicket regularTicket;
    private TouristTicket touristTicket;

    public Flight(String flightNumber, String flightAirline, int capacityOfFlight, int seatsBooked, RegularTicket regularTicket, TouristTicket touristTicket) {
        this.flightNumber = flightNumber;
        this.flightAirline = flightAirline;
        this.capacityOfFlight = capacityOfFlight;
        this.seatsBooked = seatsBooked;
        this.regularTicket = regularTicket;
        this.touristTicket = touristTicket;
    }
    public Flight(){

    }

    public String getFlightDetails(){
        return "detail is: seats available ";
    }

    public boolean checkAvailibility(){
        return false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public int getCapacityOfFlight() {
        return capacityOfFlight;
    }

    public void incrementBookingCounter() {
        this.capacityOfFlight = capacityOfFlight;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public RegularTicket getRegularTicket() {
        return regularTicket;
    }

    public void setRegularTicket(RegularTicket regularTicket) {
        this.regularTicket = regularTicket;
    }

    public TouristTicket getTouristTicket() {
        return touristTicket;
    }

    public void setTouristTicket(TouristTicket touristTicket) {
        this.touristTicket = touristTicket;
    }
}
