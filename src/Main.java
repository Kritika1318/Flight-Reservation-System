public class Main {
    public static void main(String[] args) {

        RegularTicket regularTicket=new RegularTicket("Food",true);
        String []locations={"Hyd","Gkp","LKo"};
        TouristTicket touristTicket=new TouristTicket(locations,"Lakdikapool");
        Flight flight=new Flight("SG-312","Indigo",100,58,regularTicket,touristTicket);

        //Test Case example
       // System.out.println(flight.getFlightNumber());
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
