package com.dev.sa.persistence.dao;



import com.dev.sa.common.exception.ServiceException;
import com.dev.sa.data.request.Request;



/**
 * Created by Anie on 1/10/2016.
 */
public interface EmployeeDao {
    public void createEmployee(Request employee)throws ServiceException;
}
