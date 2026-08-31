package com.qb.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This test will run automatically in Maven's "test" phase whenever you
 * execute `mvn test`, `mvn package`, or `mvn install`.
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
