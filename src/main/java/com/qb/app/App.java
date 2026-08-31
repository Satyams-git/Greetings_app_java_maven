package com.qb.app;

import org.apache.commons.lang3.StringUtils;

/**
 * QB App — Maven Demo Project.
 *
 * Yeh ek jaan-boojh kar simple rakha gaya app hai, taaki classroom mein
 * poora Maven build lifecycle (compile -> test -> package -> install)
 * kuch hi seconds mein live dikhaya ja sake.
 */
public class App {

    /**
     * Business logic ko main() se alag rakha hai, taaki ise
     * AppTest.java mein easily unit-test kiya ja sake.
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
