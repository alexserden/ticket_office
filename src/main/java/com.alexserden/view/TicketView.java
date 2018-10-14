package view;

import controller.TicketController;
import model.Ticket;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TicketView {
    TicketController ticketController;

    public TicketView() {
        this.ticketController = new TicketController();
    }
    public void buyTicket(Long id){

        Ticket ticket = ticketController.byuTicket(id);
        System.out.println(ticket.toString());
    }
    public void searchByRoute(String route) throws IOException, ParseException {
       List<Ticket> ticketList = ticketController.searchTicketsByRout(route);
        for (Ticket t : ticketList) {
            System.out.println(t.toString());
        }

    }
    public void searchByType(String type) throws IOException, ParseException {
        List<Ticket> ticketList = ticketController.searchTicketsByRout(type);
        for (Ticket t : ticketList) {
            System.out.println(t.toString());
        }

    }
    public void returnTicket(Long id){
        Ticket ticket = null;
        ticketController.returnTicket(id);
    }
}
