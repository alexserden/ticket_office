package repository.io;


import model.Ticket;
import repository.SearchTicketRepository;
import repository.buider.CreateTicket;
import repository.buider.Director;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaIOSearchTicketRepositoryImpl implements SearchTicketRepository {

    Path path = Paths.get("src/main/resource/tickets.csv");

    @Override
    public void save(Ticket ticket) throws IOException {

    }

    @Override
    public void update(Ticket ticket) throws IOException {

    }

    @Override
    public void delete(Long id) throws IOException {

    }

    @Override
    public Ticket getById(Long id) throws IOException {
        Director director = new Director();
        director.setTicketBuilder(new CreateTicket());
        BufferedReader reader = Files.newBufferedReader(path);
        Ticket ticket = null;
        while(reader.ready()) {
            String[] massTickets = reader.readLine().split(",");
            if(Long.parseLong(massTickets[0])==id){
                ticket = director.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3]);
            }
        }

        return ticket;
    }

    @Override
    public List<Ticket> getAll() throws IOException {

        List<Ticket> ticketsList = new ArrayList<>();
        BufferedReader reader = Files.newBufferedReader(path);
        Ticket ticket;
        while(reader.ready()){
            Director director = new Director();
            director.setTicketBuilder(new CreateTicket());
           String [] massTickets = reader.readLine().split(",");
         ticket = director.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3]);
           ticketsList.add(ticket);
        }
        return ticketsList;
    }
}