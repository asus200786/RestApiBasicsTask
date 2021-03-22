package com.epam.esm.dao;


import com.epam.esm.entity.Entity;
import com.epam.esm.exceptions.DAOException;

import java.util.Collection;

/**
 * Entity DAO interface.
 *
 * @author Yury Zmushko
 * @version 1.0
 */
public interface EntityDAO<T extends Entity> {

    /**
     * Create method
     *
     * @param t entity to create
     *
     * @throws DAOException
     */
    boolean create(T t) throws DAOException;

    /**
     * Read method
     *
     * @param id of the entity
     *
     * @throws DAOException
     */
    T read(int id) throws DAOException;

    /**
     * Update method
     *
     * @param t entity to create
     *
     * @throws DAOException
     */
    void update(T t) throws DAOException;

    /**
     * Delete method
     *
     * @param id of the entity to delete
     *
     * @throws DAOException
     */
    void delete(int id) throws DAOException;

    /**
     * Find all method
     *
     * @throws DAOException
     */
    Collection<T> findAll() throws DAOException;

    /**
     * Find all method
     *
     * @param offset quantity of elements to skip
     * @param quantity quantity of elements to return
     * @throws DAOException
     */
    Collection<T> findAll(int offset, int quantity) throws DAOException;

    /**
     * Count all objects method
     *
     * @throws DAOException
     */
    int countAll() throws DAOException;

}
