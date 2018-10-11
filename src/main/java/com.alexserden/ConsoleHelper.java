import view.SearchTicketView;

import java.io.IOException;
import java.text.ParseException;


public class ConsoleHelper {
    public static void main(String[] args) throws IOException, ParseException {
        SearchTicketView searchTicketView = new SearchTicketView();
        searchTicketView.searchByRoute();
    }
}
