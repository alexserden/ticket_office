package repository.io;



import model.Ticket;
import repository.BuyTicketRepositoryImpl;
import repository.buider.CreateTicket;
import repository.buider.Director;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaIOBuyTicketRepositoryImpl implements BuyTicketRepositoryImpl {
    Path path = Paths.get("src/main/resource/buyTickets.csv");


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
        BufferedReader reader = Files.newBufferedReader(path);
        Ticket ticket;
        while(reader.ready()){
            String [] mas = reader.readLine().split(",");
            if(Long.parseLong(mas[0])==id){
                Director director = new Director();
                director.setTicketBuilder(new CreateTicket());
                ticket = director.createTicket(Long.parseLong(mas[0]),mas[1],mas[2],mas[3]);
                return ticket;
            }
        }
        reader.close();
        return null;
    }

    @Override
    public List<Ticket> getAll() throws IOException {
        List<Ticket> list = new ArrayList<>();
        BufferedReader reader = Files.newBufferedReader(path);
        Ticket ticket;
        while(reader.ready()){
            String [] mass = reader.readLine().split(",");
            Director directorBuy = new Director();
            directorBuy.setTicketBuilder(new CreateTicket());
            ticket = directorBuy.createTicket(Long.parseLong(mass[0]),mass[1],mass[2],mass[3]);
            list.add(ticket);
        }
        reader.close();
        return list;
    }
}
