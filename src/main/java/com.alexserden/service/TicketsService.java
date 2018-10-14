package service;


import model.Ticket;
import model.TicketStatus;
import model.Type;
import repository.TicketRepository;
import repository.io.JavaIOSearchTicketRepositoryImpl;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TicketsService {
    TicketRepository searchTicketRepository;

    public TicketsService() {
        searchTicketRepository = new JavaIOSearchTicketRepositoryImpl();
    }

    public Ticket buyTicket(Long id) {
        Ticket ticket = null;
        try {
            ticket = searchTicketRepository.getById(id);
            ticket.setTicketStatus(TicketStatus.Bought);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ticket;
    }

    public void returnTicket(Long id) {
        Ticket ticket;
        try {
            ticket = searchTicketRepository.getById(id);
            searchTicketRepository.save(ticket);
            ticket.setTicketStatus(TicketStatus.Return);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<Ticket> searchByRoute(String route) throws IOException, ParseException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            String s = t.getRoute().getRoute();
            if (s.contains(route)) {
                tickets.add(t);
            }

        }
        return tickets;
    }


    public List<Ticket> searchByType(String type) throws IOException, ParseException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            if (type.equals("Business Class")) {
                if (t.getType() == Type.Business) {
                    tickets.add(t);
                }
            } else if (type.equals("Economy Class")) {
                if (t.getType() == Type.Economy) {
                    tickets.add(t);
                }
            }

        }
        return tickets;
    }
}