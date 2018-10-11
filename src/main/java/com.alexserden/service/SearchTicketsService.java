package service;


import model.Ticket;
import model.Type;
import repository.SearchTicketRepository;
import repository.io.JavaIOSearchTicketRepositoryImpl;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class SearchTicketsService {
    SearchTicketRepository searchTicketRepository;

    public SearchTicketsService() {
        searchTicketRepository = new JavaIOSearchTicketRepositoryImpl();
    }

    public List<Ticket> searchByRoute(String route) throws IOException, ParseException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            String s = t.getRoute().getRoute();
            if(s.contains(route)){
                tickets.add(t);
            }

        }
        return tickets;
    }


    public List<Ticket> searchByType(String type) throws IOException, ParseException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            if(type.equals("Business Class")){
            if(t.getType()==Type.Business){
                tickets.add(t);
            }
            }else if(type.equals("Economy Class")){
                if(t.getType()==Type.Economy){
                    tickets.add(t);
                }
            }

        }
        return tickets;
    }
}
