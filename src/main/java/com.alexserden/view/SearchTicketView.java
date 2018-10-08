package view;


import controller.SearchTicketsController;
import model.Ticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SearchTicketView {
    SearchTicketsController searchTicketsController;

    public SearchTicketView() {
        this.searchTicketsController = new SearchTicketsController();
    }

    public void execute() throws InterruptedException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Ticket> list = new ArrayList<>();
        System.out.println("Выберите критерии поиска : ByRoute, ByTime, ByType");
        String search = bufferedReader.readLine();
        System.out.println("Введите данные поиска:");
        String data = bufferedReader.readLine();

        switch (search){
            case "ByRoute":
              list = searchTicketsController.searchTicketsByRout(data);
                break;
            case "ByTime":
               list = searchTicketsController.searchTicketsByTime(data);
                break;
            case "ByType":
               list = searchTicketsController.searchTicketsByType(data);
                break;
        }
        for (Ticket ticket : list) {
            System.out.println(ticket.toString());
        }
    }
}
