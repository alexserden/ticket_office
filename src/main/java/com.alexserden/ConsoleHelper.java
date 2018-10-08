import view.SearchTicketView;

import java.io.IOException;


public class ConsoleHelper {
    public static void main(String[] args) throws InterruptedException, IOException {
        SearchTicketView searchTicketView = new SearchTicketView();
        searchTicketView.execute();
    }
}
