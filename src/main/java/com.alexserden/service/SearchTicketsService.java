package service;


import model.Ticket;
import model.Type;
import repository.SearchTicketRepository;
import repository.io.JavaIOSearchTicketRepositoryImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchTicketsService {
    SearchTicketRepository searchTicketRepository;

    public SearchTicketsService() {
        searchTicketRepository = new JavaIOSearchTicketRepositoryImpl();
    }

    public List<Ticket> searchByRoute(String route) throws IOException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            if((t.getRoute().getRoute()).contains(route)){
                tickets.add(t);
            }

        }
        return tickets;
    }
    public List<Ticket> searchByTime(String time) throws IOException {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket t : searchTicketRepository.getAll()) {
            if(t.getTime().getTime().contains(time)){
                tickets.add(t);
            }

        }
        return tickets;
    }
    public List<Ticket> searchByType(String type) throws IOException {
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
