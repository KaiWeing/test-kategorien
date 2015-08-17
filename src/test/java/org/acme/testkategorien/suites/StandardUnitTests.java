package org.acme.testkategorien.suites;

import org.acme.testkategorien.kategorien.ManuellerTest;
import org.junit.Ignore;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Alle Unittests, ohne die manuellen
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({AllUnitTests.class})
@Categories.ExcludeCategory({ManuellerTest.class})
@Ignore
public class StandardUnitTests {
}
