package org.acme.testkategorien.suites;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

/**
 * Alle Integrationstests (mit Endung *IT)
 */
@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters(".*IT")
public class AllIntegrationTests {
}
