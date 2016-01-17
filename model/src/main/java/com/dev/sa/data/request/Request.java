package com.dev.sa.data.request;
import com.dev.sa.data.request.data.model.Employee;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Anie on 12/27/2015.
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.WRAPPER_OBJECT,property="property")
@JsonSubTypes(@JsonSubTypes.Type(name="Employee",value =Employee.class))
public abstract class Request implements Serializable{
    //@NotNull(message ="Request object cannot be null")

    private String transactionId;
    public String getTransactionId() {

        if (transactionId==null)
        {
            transactionId= UUID.randomUUID().toString();
        }
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
           }

}
