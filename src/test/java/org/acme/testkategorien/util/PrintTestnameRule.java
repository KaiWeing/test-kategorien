package org.acme.testkategorien.util;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * @author KAW
 */
public class PrintTestnameRule implements TestRule {
    public Statement apply(Statement base, Description description) {

        System.out.printf("Running %s.%s%n", description.getTestClass().getName(), description.getMethodName());

        return base;
    }
}
