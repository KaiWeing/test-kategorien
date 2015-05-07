package org.acme.testkategorien.suites;

import org.acme.testkategorien.kategorien.ManuellerTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author KAW
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({AllTests.class})
@Categories.ExcludeCategory({ManuellerTest.class})
public class UnitTests {
}
