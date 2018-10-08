package controller;

import model.Ticket;
import service.SearchTicketsService;

import java.io.IOException;
import java.util.List;

public class SearchTicketsController {
    SearchTicketsService searchTicketsService;

    public SearchTicketsController() {
        searchTicketsService = new SearchTicketsService();
    }

    public List<Ticket> searchTicketsByRout(String route) throws IOException {
        return searchTicketsService.searchByRoute(route);
    }

    public List<Ticket> searchTicketsByTime(String time) throws IOException {
        return searchTicketsService.searchByTime(time);
    }

    public List<Ticket> searchTicketsByType(String type) throws IOException {
        return searchTicketsService.searchByType(type);

    }
}
