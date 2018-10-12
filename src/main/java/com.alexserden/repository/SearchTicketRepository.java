package repository;

import model.Ticket;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;


public interface SearchTicketRepository {
    void save(Ticket ticket) throws IOException;

    void update(Ticket ticket) throws IOException, ParseException;

    void delete(Long id) throws IOException, ParseException;

    Ticket getById(Long id) throws IOException, ParseException;

    List<Ticket> getAll() throws IOException, ParseException;
}
