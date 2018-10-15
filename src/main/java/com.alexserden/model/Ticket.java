package model;

public class Ticket extends IdEntity{

    private Route route;
    private  Type type;
    private TicketStatus ticketStatus;

    public Ticket(){

    }

    public Ticket(Long id, Route route,Type type, TicketStatus ticketStatus) {
        super(id);
        this.route = route;
        this.type = type;
        this.ticketStatus = ticketStatus;
    }


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
