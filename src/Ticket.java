public abstract class Ticket {
    private String pnr;
    private String departureTime;
    private String destinationLocation;
    private Flight flight;
    private String dateOfDeparture;
    private String timeOfDeparture;
    private String ticketStatus;
    private Passenger passanger;
    private String seatNumber;
    private String price;

    public Ticket(String pnr, String departureTime, String destinationLocation,
                  Flight flight, String dateOfDeparture, String timeOfDeparture,
                  String ticketStatus, Passenger passanger, String seatNumber, String price) {
        this.pnr = pnr;
        this.departureTime = departureTime;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.ticketStatus = ticketStatus;
        this.passanger = passanger;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public Ticket(){

    }

    public String getStatus(){
        return "ticket status are following: ";
    }
    public String durationOfJourney(){
        return "Duration of journey is: ";
    }
    public boolean canceltheTicket(){
        return true;
    }


    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Passenger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passenger passanger) {
        this.passanger = passanger;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
