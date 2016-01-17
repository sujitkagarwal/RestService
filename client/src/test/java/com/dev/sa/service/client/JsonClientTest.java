package com.dev.sa.service.client;

import com.dev.sa.data.model.Employee;
import com.dev.sa.data.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Anie on 1/1/2016.
 */
public class JsonClientTest {
    JsonClient jsonClient=null;
    @Before
    public void setup()
    {
         jsonClient = new JsonClient();
    }
    @Test
    public void execute()
    {
    try {

        Employee employee=new Employee((int) (Math.random()*10),"sujit agarwal",33,"214-729-0647",new Date());
        Response res= jsonClient.execute("http://localhost:8080/Service/services/execution/generic/perform", employee);
        System.out.println("response::: "+res.getStatus());
        System.out.println("response::: "+res.getResponse());
    }
    catch (Exception e)
    {
        e.printStackTrace();

        Assert.fail();
    }
    }
}
