package com.dev.sa.persistence.dao.impl;

import com.dev.sa.common.exception.ServiceException;
import com.dev.sa.data.request.Request;
import com.dev.sa.data.request.data.model.Employee;
import com.dev.sa.persistence.dao.EmployeeDao;
import org.springframework.data.cassandra.core.CassandraTemplate;

/**
 * Created by Anie on 1/9/2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private CassandraTemplate cassandraTemplate;
    public void createEmployee(Request employee)throws ServiceException
    {
        try {
            cassandraTemplate.insert((Employee) employee);
        }
        catch (Throwable exception)
        {
            throw new ServiceException("Fail to create employee ",exception);
        }
    }
    public void setCassandraTemplate(CassandraTemplate cassandraTemplate) {
        this.cassandraTemplate = cassandraTemplate;
    }
}
