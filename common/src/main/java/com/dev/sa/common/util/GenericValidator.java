package com.dev.sa.common.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


/**
 * Created by Anie on 1/1/2016.
 */
public class GenericValidator<T> {
    public static final String validationMessage="Mendatory infromation missing:: %s";

    public void validate(T request)throws Exception {
        //System.out.println("Validation Request");
       final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
       // System.out.println("Validation Request1");
       final Validator validator = factory.getValidator();
        //System.out.println("Validation Request2");
       final  Set<ConstraintViolation<T>> violations = validator.validate(request);
        //System.out.println("Validation Request3");
        if (!violations.isEmpty()) {
            System.out.println("Validation Request if block");
        throw new Exception(String.format(validationMessage,violations.iterator().next().getMessage()));
        }
        //System.out.println("Validation Request4");
    }

}
