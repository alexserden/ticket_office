package repository;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface GenericRepository<T, ID> {
    void save(T t) throws IOException;

    void update(T t) throws IOException,ParseException;

    void delete(ID id) throws IOException,ParseException;

    T getById(ID id) throws IOException, ParseException;

    List<T> getAll() throws IOException, ParseException;


}
