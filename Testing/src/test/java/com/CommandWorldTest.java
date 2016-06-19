package com;

import com.hystrix.CommandWorld;
import org.junit.Assert;
import org.junit.Test;
import rx.Observable;

/**
 * Created by Anie on 6/19/2016.
 */
public class CommandWorldTest {


    @Test
    public void testSynchronous() {

        CommandWorld commandWorld=new CommandWorld("World");
        Observable<String> fWorld=commandWorld.toObservable();
        Assert.assertEquals("Hello World!", fWorld.toBlocking().single());

    }
}
