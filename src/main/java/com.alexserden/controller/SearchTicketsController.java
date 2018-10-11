package controller;

import model.Ticket;
import service.SearchTicketsService;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class SearchTicketsController {
    SearchTicketsService searchTicketsService;

    public SearchTicketsController() {
        searchTicketsService = new SearchTicketsService();
    }

    public List<Ticket> searchTicketsByRout(String route) throws IOException, ParseException {
        return searchTicketsService.searchByRoute(route);
    }



    public List<Ticket> searchTicketsByType(String type) throws IOException, ParseException {
        return searchTicketsService.searchByType(type);

    }
}
