package org.acme.testkategorien.suites;

import org.acme.testkategorien.kategorien.ManuellerTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Alle Integrationstests, ohne die manuellen
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({AllIntegrationTests.class})
@Categories.ExcludeCategory({ManuellerTest.class})
public class StandardIntegrationTests {
}
