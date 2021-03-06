package org.rf.bootrest.dao;

import java.util.List;
import java.util.Optional;

import org.rf.bootrest.model.Todo;
import org.springframework.data.repository.Repository;

/**
 * @author Roberto
 */
public interface TodoRepository extends Repository<Todo, String> {

    /**
     * Deletes a todo entry from the database.
     * @param deleted   The deleted todo entry.
     */
    void delete(Todo deleted);

    /**
     * Finds all todo entries from the database.
     * @return  The information of all todo entries that are found from the database.
     */
    List<Todo> findAll();

    /**
     * Finds the information of a single todo entry.
     * @param id    The id of the requested todo entry.
     * @return      The information of the found todo entry. If no todo entry
     *              is found, this method returns an empty {@link java.util.Optional} object.
     */
    Optional<Todo> findOne(String id);

    /**
     * Saves a new todo entry to the database.
     * @param saved The information of the saved todo entry.
     * @return      The information of the saved todo entry.
     */
    Todo save(Todo saved);
}
