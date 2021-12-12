public class RegularTicket extends Ticket {
    private String serviceRequestedByPassanger;
    private boolean isServicesAvailed;

    public RegularTicket(String serviceRequestedByPassanger, boolean isServicesAvailed) {
        super("12345","12:45","LKO",null,"12-12-2021","1","CONFIRMED",null,"69","1000");
        this.serviceRequestedByPassanger = serviceRequestedByPassanger;
        this.isServicesAvailed = isServicesAvailed;
    }

    public boolean ifServiceAvailed(){
        return false;
    }
    public String updateThePassengerIfServiceAvailed(){
        return "Services are not availed by passenger";
    }

    public String getServiceRequestedByPassanger() {
        return serviceRequestedByPassanger;
    }

    public void setServiceRequestedByPassanger(String serviceRequestedByPassanger) {
        this.serviceRequestedByPassanger = serviceRequestedByPassanger;
    }

    public boolean isServicesAvailed() {
        return isServicesAvailed;
    }

    public void setServicesAvailed(boolean servicesAvailed) {
        isServicesAvailed = servicesAvailed;
    }
}
