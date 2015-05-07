# Test Kategorien

Veranschaulicht die Kategorisierung von Tests per JUnit Categories und Verzeichnisstruktur.

## Kategorie Integrationstest und Unittests
Integrationstests liegen in Ordner src/it/java und src/it/resources und werden über das Goal verify ausgeführt.

Unittests liegen in Ordner src/test/java und src/test/resources und werden über das Goal test ausgeführt.

## Kategorie LangsamerTest und ManuellerTest
Können an Testklassen oder -methoden annotiert werden. Können sowohl an Integrationstests als auch an Unit-Tests vergeben werden.

Über die excludedGroups Konfiguration von Surefire und Failsafe sind manuelle und langsame Tests standardmäßig ausgeklammert.
Die langsamen Tests lassen sich jedoch über das Profil -PincludeSlowTests wieder mit einbinden.

## Test aus der IDE
Die Suite UnitTests durchläuft alle Tests ohne die Annotationen. Leider aber auch den Integrationstest. 
Gibt es eine Möglichkeit dies zu verhindern? Ein Ordnerbasierter exclude ist ggf. über DirectorySuiteBuilder aus junit-addons möglich,
aber funktioniert dies stabil mit relativen Pfaden? Fühlt sich etwas nach Hack an.
 
Ggf. besser:
* Integrationstests bekommen zusätzlich eigenen Suffix oder eigenes Package, oder
* Integrationstest liegen in separatem Projekt