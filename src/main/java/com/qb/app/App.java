package com.qb.app;

import org.apache.commons.lang3.StringUtils;

/**
 * QB App — Maven Demo Project.
 *
 * This intentionally simple application is designed to demonstrate the
 * full Maven build lifecycle (compile -> test -> package -> install)
 * in just a few seconds in the classroom.
 */
public class App {

    /**
     * Keep the business logic separate from main() so it can be easily
     * unit-tested in AppTest.java.
     */
    public static String buildGreeting(String name) {
        if (StringUtils.isBlank(name)) {
            name = "Trainer";
        }
        String cleanName = StringUtils.capitalize(name.trim().toLowerCase());
        return "Hello Team, Welcome to the DevOps Training Program with QualiBytes with " + cleanName + "!";
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "";
        System.out.println(buildGreeting(name));
        System.out.println("This JAR was built and packaged entirely by Maven. No javac. No manual jar command.");
    }
}
