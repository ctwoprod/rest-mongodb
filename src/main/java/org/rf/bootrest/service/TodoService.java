package org.rf.bootrest.service;

import java.util.List;

import org.rf.bootrest.model.TodoDTO;

/**
 * @author Roberto
 */
public interface TodoService {

    /**
     * Creates a new todo entry.
     * @param todo  The information of the created todo entry.
     * @return      The information of the created todo entry.
     */
    TodoDTO create(TodoDTO todo);

    /**
     * Deletes a todo entry.
     * @param id    The id of the deleted todo entry.
     * @return      THe information of the deleted todo entry.
     */
    TodoDTO delete(String id);

    /**
     * Finds all todo entries.
     * @return      The information of all todo entries.
     */
    List<TodoDTO> findAll();

    /**
     * Finds a single todo entry.
     * @param id    The id of the requested todo entry.
     * @return      The information of the requested todo entry.
     */
    TodoDTO findById(String id);

    /**
     * Updates the information of a todo entry.
     * @param todo  The information of the updated todo entry.
     * @return      The information of the updated todo entry.
     */
    TodoDTO update(TodoDTO todo);
}
