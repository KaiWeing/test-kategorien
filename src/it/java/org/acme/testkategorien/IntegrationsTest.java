package org.acme.testkategorien;

import org.acme.testkategorien.kategorien.LangsamerTest;
import org.acme.testkategorien.kategorien.ManuellerTest;
import org.acme.testkategorien.util.PrintTestnameRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author KAW
 */
public class IntegrationsTest {

    @Rule
    public PrintTestnameRule rule = new PrintTestnameRule();

    @Test
    public void einIntegrationsTest() {

    }

    @Test
    @Category(LangsamerTest.class)
    public void einLangsamerIntegrationsTest() {

    }

    @Test
    @Category(ManuellerTest.class)
    public void einManuellerIntegrationsTest() {

    }
}
