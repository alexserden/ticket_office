package repository.io;

import model.Ticket;
import repository.ReturnTicketRepository;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaIOReturnTicketRepositoryImpl implements ReturnTicketRepository {
    Path path = Paths.get("src/main/resource/returnTicket.csv");

    @Override
    public void save(Ticket ticket) throws IOException {

    }

    @Override
    public void delete(Long id) throws IOException {

    }

    @Override
    public void update(Ticket ticket) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(path);
       String line = ticket.getId()+","+ticket.getRoute().getRoute()
               +","+ticket.getTime().getTime()+","+ticket.getType().toString();
        writer.write(line);
        writer.close();
    }

    @Override
    public Ticket getById(Long id) throws IOException {

        return null;
    }

    @Override
    public List<Ticket> getAll() throws IOException {
        return null;
    }
}