package repository.buider;

import model.Ticket;

public abstract class TicketBuilder {
    Ticket ticket;

    public TicketBuilder(){
        ticket = new Ticket();
    }

    abstract void buildRoute(Long id, String name);
    abstract void buildTime(Long id, String name);
    abstract void buildType(String name);

    Ticket getTicket(){
        return ticket;
    }
}
