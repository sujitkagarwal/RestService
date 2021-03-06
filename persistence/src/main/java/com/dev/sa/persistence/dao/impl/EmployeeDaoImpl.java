package com.dev.sa.persistence.dao.impl;

import com.dev.sa.common.exception.ServiceException;
import com.dev.sa.data.request.Request;
import com.dev.sa.data.model.Employee;
import com.dev.sa.persistence.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Component;


@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private CassandraOperations cassandraOperations;
   // private CassandraTemplate cassandraTemplate;
    public void createEmployee(Request employee)throws ServiceException
    {
        try {
            cassandraOperations.insert((Employee) employee);
        }
        catch (Throwable exception)
        {
            throw new ServiceException("Fail to create employee ",exception);
        }
    }
    /*public void setCassandraTemplate(CassandraTemplate cassandraTemplate) {
        this.cassandraTemplate = cassandraTemplate;
    }*/
}
