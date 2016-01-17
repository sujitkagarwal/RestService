package com.dev.sa.operation.impl;


import com.dev.sa.data.request.Request;
import com.dev.sa.data.response.Response;
import com.dev.sa.persistence.dao.EmployeeDao;

/**
 * Created by Anie on 12/27/2015.
 */
public class PerformImpl {
      private EmployeeDao employeeDao;
    public Response peformOpertaion(Request request) throws Exception
    {    System.out.println("PerformImpl Request--"+request.getTransactionId());
         employeeDao.createEmployee(request);
        Response res=new Response();
        res.setStatus("success");
        res.setResponse("Employee created successfully");
        return res;
    }
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


}
