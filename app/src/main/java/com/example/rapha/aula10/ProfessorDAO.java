package com.example.rapha.aula10;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

/**
 * Created by rapha on 17/03/2016.
 */
public class ProfessorDAO extends BaseDaoImpl<Professor, Integer>{
    protected ProfessorDAO(ConnectionSource connectionSource) throws SQLException {
        super(Professor.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
