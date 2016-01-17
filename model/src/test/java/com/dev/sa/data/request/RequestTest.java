package com.dev.sa.data.request;

import com.dev.sa.data.request.Request;
import com.dev.sa.data.request.data.model.Employee;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Anie on 1/11/2016.
 */
public class RequestTest {

    @Test
    public void TestRequest()
    {
    try {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee(123, "sujit agarwal", 33, "214-729-0647", new Date());
        String output = objectMapper.writeValueAsString(employee);
        com.dev.sa.data.request.Request request1=objectMapper.readValue(output, Request.class);
        Employee e=(Employee)request1;
        System.out.println( e.getAge());
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }

    }


}
