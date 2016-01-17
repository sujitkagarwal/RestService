package com.dev.sa.persistence.dao;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anie on 1/10/2016.
 */

public class AbstractTestPersistence {
    public static ApplicationContext ctx;
    @BeforeClass
    public static void setup()
    {
    ctx=new ClassPathXmlApplicationContext("persistance-spring.xml");
    }

    @AfterClass
    public static void tearDown()
    {
        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
