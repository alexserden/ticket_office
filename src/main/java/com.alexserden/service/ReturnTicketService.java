package service;

import model.Ticket;
import repository.ReturnTicketRepository;
import repository.io.JavaIOReturnTicketRepositoryImpl;

import java.io.IOException;

public class ReturnTicketService {
    ReturnTicketRepository returnTicketRepository;

    public ReturnTicketService() {
        returnTicketRepository = new JavaIOReturnTicketRepositoryImpl();
    }
    public void returnTicket(Ticket ticket) throws IOException {
        returnTicketRepository.update(ticket);
    }
}
