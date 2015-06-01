# Test Kategorien

Veranschaulicht die Kategorisierung von Tests per JUnit Categories, Suffixes und Verzeichnisstruktur.

## Kategorie Integrationstest und Unittests
Integrationstests haben die Endung IT, liegen in Ordner src/it/java und src/it/resources und werden über das Goal verify ausgeführt.

Unittests haben die Endung Test, liegen in Ordner src/test/java und src/test/resources und werden über das Goal test ausgeführt.

## Kategorie LangsamerTest und ManuellerTest
Können an Testklassen oder -methoden annotiert werden. Können sowohl an Integrationstests als auch an Unit-Tests vergeben werden.

Über die excludedGroups Konfiguration von Surefire und Failsafe sind manuelle und langsame Tests standardmäßig ausgeklammert.
Die langsamen Tests lassen sich jedoch über das Profil -PincludeSlowTests wieder mit einbinden.

## Test aus der IDE
Unter Eclipse ist es nicht möglich, bei der Ausführung von Tests eines Ordners nach Categories zu filtern, daher müssen
zur Filterung UnitTests-Suites verwendet werden.
Die Suite AllUnitTests scannt den Classpath nach Klassen mit der Endung Test. Diese wird durch die Suite StandardUnitTests
gefiltert auf die Tests die nicht die Category ManuellerTest haben.
 
Für Integrationstests wurde vorerst keine Suite erstellt, da angenommen wird, dass in der pre und post-integration-test phase
setup und teardown Tasks stattfinden, die nur unter Maven ausgeführt werden und daher immer über mvn verify gegangen wird.
Falls dem nicht so ist, kann hier genauso mit Suites gearbeitet werden.

In Eclipse wird dann statt eines Test-Verzeichnisses nur die Test-Suite StandardUnitTests ausgeführt.