package view;

import controller.SearchTicketsController;
import model.Ticket;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class SearchTicketView {
    SearchTicketsController searchTicketsController;

    public SearchTicketView() {
        this.searchTicketsController = new SearchTicketsController();
    }
    public void searchByRoute() throws IOException, ParseException {
       List<Ticket> ticketList = searchTicketsController.searchTicketsByRout("Днепр - Москва");
        for (Ticket t : ticketList) {
            System.out.println(t.toString());
        }
    }
}
