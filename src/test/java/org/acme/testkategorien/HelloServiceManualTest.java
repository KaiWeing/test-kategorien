package org.acme.testkategorien;

import org.acme.testkategorien.util.PrintTestnameRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by KAW on 17.08.2015.
 */
public class HelloServiceManualTest {

    @Rule
    public PrintTestnameRule rule = new PrintTestnameRule();


    @Test
    public void testManually() {
        HelloService service = new HelloService();

        service.sayHello("boo");
    }

}
