package org.acme.testkategorien;

import org.acme.testkategorien.kategorien.LangsamerTest;
import org.acme.testkategorien.kategorien.ManuellerTest;
import org.acme.testkategorien.util.PrintTestnameRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author KAW
 */
public class HelloServiceTest {

    @Rule
    public PrintTestnameRule rule = new PrintTestnameRule();

    @Test
    public void testSayHello() throws Exception {
        HelloService helloService = new HelloService();

        assertThat(helloService.sayHello("Max"), is("Hello Max!"));
    }

    @Test
    @Category(LangsamerTest.class)
    public void testLangsamerTest() {

    }

    @Test
    @Category(ManuellerTest.class)
    public void testManuellerTest() {

    }

}