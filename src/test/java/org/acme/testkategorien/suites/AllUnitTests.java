package org.acme.testkategorien.suites;

import org.junit.Ignore;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

/**
 * Alle UnitTests (mit Endung *Test)
 */
@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters(".*Test")
@Ignore
public class AllUnitTests {
}
