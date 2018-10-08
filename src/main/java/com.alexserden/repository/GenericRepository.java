package repository;

import java.io.IOException;
import java.util.List;

public interface GenericRepository<T, ID> {
    void save(T t) throws IOException;

    void update(T t) throws IOException;

    void delete(ID id) throws IOException;

    T getById(ID id) throws IOException;

    List<T> getAll() throws IOException;


}
