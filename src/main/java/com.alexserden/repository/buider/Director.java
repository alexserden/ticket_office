package repository.buider;

import model.Ticket;

public class Director {
    private TicketBuilder ticketBuilder;

    public void setTicketBuilder(TicketBuilder ticketBuilder) {
        this.ticketBuilder = ticketBuilder;
    }

    public Ticket createTicket(Long id,String route,String time,String type) {
        ticketBuilder.buildRoute(id,route);
        ticketBuilder.buildTime(id,time);
        ticketBuilder.buildType(type);

       return ticketBuilder.getTicket();

    }
}
