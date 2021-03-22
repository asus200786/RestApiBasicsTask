package com.epam.esm.dao;

import com.epam.esm.entity.Entity;
import com.epam.esm.exceptions.DAOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;

public abstract class MySQLEntityDAO<T extends Entity> implements EntityDAO<T>{
    private JdbcTemplate template;

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public JdbcTemplate getTemplate() {
        return this.template;
    }

    /**
     * Create method
     *
     * @param t entity to create
     *
     * @throws DAOException
     */
    public abstract boolean create(T t) throws DAOException;

    /**
     * Read method
     *
     * @param id of the entity
     *
     * @throws DAOException
     */
    public abstract T read(int id) throws DAOException;

    /**
     * Update method
     *
     * @param t entity to create
     *
     * @throws DAOException
     */
    public abstract void update(T t) throws DAOException;

    /**
     * Delete method
     *
     * @param id of the entity to delete
     *
     * @throws DAOException
     */
    public abstract void delete(int id) throws DAOException;

    /**
     * Find all method
     *
     * @throws DAOException
     */
    public abstract Collection<T> findAll() throws DAOException;

    /**
     * Find all method
     *
     * @param offset quantity of elements to skip
     * @param quantity quantity of elements to return
     * @throws DAOException
     */
    public abstract Collection<T> findAll(int offset, int quantity) throws DAOException;

    /**
     * Count all objects method
     *
     * @throws DAOException
     */
    public abstract int countAll() throws DAOException;

}
