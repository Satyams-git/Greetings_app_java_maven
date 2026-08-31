package com.qb.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Yeh test Maven ke "test" phase mein automatically run hoga —
 * jab bhi aap `mvn test`, `mvn package`, ya `mvn install` chalayenge.
 */
public class AppTest {

    @Test
    public void greetsGivenNameCorrectly() {
        String result = App.buildGreeting("satyam");
        assertEquals("Hello Team, Welcome to the DevOps Training Program with QualiBytes with Satyam!", result);
    }

    @Test
    public void defaultsToTrainerWhenNameIsBlank() {
        String result = App.buildGreeting("");
        assertEquals("Hello Team, Welcome to the DevOps Training Program with QualiBytes with Trainer!", result);
    }
}
