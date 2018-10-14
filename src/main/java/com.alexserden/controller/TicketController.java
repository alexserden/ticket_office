package controller;

import model.Ticket;
import service.TicketsService;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TicketController {
    TicketsService ticketsService;

    public TicketController() {
        ticketsService = new TicketsService();
    }

    public Ticket byuTicket(Long id) {
        return ticketsService.buyTicket(id);
    }
    public void returnTicket(Long id){
         ticketsService.returnTicket(id);
    }


    public List<Ticket> searchTicketsByRout(String route) throws IOException, ParseException {
        return ticketsService.searchByRoute(route);
    }


    public List<Ticket> searchTicketsByType(String type) throws IOException, ParseException {
        return ticketsService.searchByType(type);

    }
}