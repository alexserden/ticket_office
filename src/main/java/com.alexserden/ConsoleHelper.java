

import model.Ticket;
import view.TicketView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class ConsoleHelper {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Авиакасса:");
        System.out.println("Выберите действие");
        System.out.println("Поиск билета: маршрут,тип");
        System.out.println("Покупка билета: id");
        System.out.println("Возврат билета: возврат");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TicketView ticketView = new TicketView();
        String name = reader.readLine();
        switch(name){
            case "маршрут":
                System.out.println("Введите маршрут:");
                ticketView.searchByRoute(reader.readLine());
                break;
            case "тип":
                System.out.println("Введите тип:");
                ticketView.searchByType(reader.readLine());
                break;
            case "id":
                System.out.println("Введите id:");
                ticketView.buyTicket(Long.parseLong(reader.readLine()));
                break;
            case "возврат":
                System.out.println("Введите билет:");
                ticketView.returnTicket(reader.readLine());
                break;


        }
    }
}
