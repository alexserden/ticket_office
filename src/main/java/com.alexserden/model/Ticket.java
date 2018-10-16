package model;

public class Ticket extends IdEntity{

    private Route route;
    private Aircraft aircraft;
    private  Type type;
    private TicketStatus ticketStatus;

    public Ticket(){

    }

    public Ticket(Long id, Route route, Aircraft aircraft, Type type, TicketStatus ticketStatus) {
        super(id);
        this.route = route;
        this.aircraft = aircraft;
        this.type = type;
        this.ticketStatus = ticketStatus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
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
