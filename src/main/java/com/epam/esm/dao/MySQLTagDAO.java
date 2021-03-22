package com.epam.esm.dao;

import com.epam.esm.entity.Tag;
import com.epam.esm.exceptions.DAOException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;

public class MySQLTagDAO extends MySQLEntityDAO<Tag>{

    @Override
    public boolean create(Tag tag) throws DAOException {
        return false;
    }

    @Override
    public Tag read(int id) throws DAOException {
        JdbcTemplate template = getTemplate();
        template.execute("null");
        return null;
    }

    @Override
    public void update(Tag tag) throws DAOException {

    }

    @Override
    public void delete(int id) throws DAOException {

    }

    @Override
    public Collection<Tag> findAll() throws DAOException {
        return null;
    }

    @Override
    public Collection<Tag> findAll(int offset, int quantity) throws DAOException {
        return null;
    }

    @Override
    public int countAll() throws DAOException {
        return 0;
    }
}
