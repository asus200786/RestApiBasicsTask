package com.epam.esm.dao;

import com.epam.esm.entity.Entity;
import com.epam.esm.exceptions.DAOException;

import java.util.Collection;

public class MySQLEntityDAO<T extends Entity> implements EntityDAO<T>{

    @Override
    public boolean create(T t) throws DAOException {
        return false;
    }

    @Override
    public T read(int id) throws DAOException {
        return null;
    }

    @Override
    public void update(T t) throws DAOException {

    }

    @Override
    public void delete(int id) throws DAOException {

    }

    @Override
    public Collection<T> findAll() throws DAOException {
        return null;
    }

    @Override
    public Collection<T> findAll(int offset, int quantity) throws DAOException {
        return null;
    }

    @Override
    public int countAll() throws DAOException {
        return 0;
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String getSchemaName() {
        return null;
    }
}
