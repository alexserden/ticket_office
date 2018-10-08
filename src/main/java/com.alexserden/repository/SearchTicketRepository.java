package repository;

import model.Ticket;

import java.io.IOException;
import java.util.List;


public interface SearchTicketRepository extends GenericRepository<Ticket, Long> {
    void save(Ticket ticket) throws IOException;

    void update(Ticket ticket) throws IOException;

    void delete(Long id) throws IOException;

    Ticket getById(Long id) throws IOException;

    List<Ticket> getAll() throws IOException;
}
