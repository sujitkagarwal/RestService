package com.dev.sa.persistence.dao;

import com.dev.sa.data.model.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

/**
 * Created by Anie on 1/10/2016.
 */
public class EmployeeDaoTest extends AbstractTestPersistence {
    private   EmployeeDao employeeDao;
    @Before
    public void setupBefore() {

        employeeDao=(EmployeeDao)ctx.getBean("employee");
    }

    @Test
    public void createEmployeeTest()
    {
        try {
            Employee employee = new Employee((int) (Math.random()*10), "sujit agarwal", 33, "214-729-0647",new Date());
            employeeDao.createEmployee(employee);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

}
