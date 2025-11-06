Projekt mit Gradle (Anleitung)

Kurz: Ich habe `build.gradle` + `settings.gradle` angelegt und dein Quellcode wurde für das Standard-Layout (`src/main/java`, `src/test/java`) angepasst.

Warum der Wrapper fehlt
- Ich habe versucht, die Gradle-Distribution herunterzuladen, um den vollständigen Gradle-Wrapper (`gradle-wrapper.jar`) automatisch zu erzeugen, aber der Download konnte in dieser Umgebung nicht abgeschlossen werden (Timeout / Netzwerkbeschränkung).

Was du lokal tun solltest (cmd.exe)
1) Prüfen, ob Gradle installiert ist:

```cmd
gradle -v
```

2a) Wenn Gradle installiert ist: Erzeuge den Wrapper und führe Tests aus

```cmd
gradle wrapper
gradlew.bat test
```

2b) Wenn Gradle nicht installiert ist: installiere Gradle (z. B. via https://gradle.org/install/) oder lade das Wrapper-Zip manuell in deine CI/Repo (nicht empfohlen).

Alternativ (nur einmalig): Wenn du keine Installation willst, kannst du lokal den Wrapper erzeugen (erfordert aber einmalig eine Gradle-Installation):

```cmd
:: in Projekt-Root
gradle wrapper
```

3) Tests lokal in IntelliJ ausführen
- Öffne das Projekt in IntelliJ, importiere das `build.gradle` als Gradle-Projekt (Reload).
- IntelliJ lädt automatisch die JUnit-Abhängigkeit und die Tests sollten grün laufen.

Status heute
- `build.gradle` enthält JUnit Jupiter 5.10.0 als Test-Dependency.
- `Vector.java` ist im Package `vector` (Dateipfad: `src/main/java/vector/Vector.java`).
- `VectorTest.java` ist im Package `vector` (Dateipfad: `src/test/java/vector/VectorTest.java`).
- Produktion: `javac`-Kompilierung der Code-Classes lokal in dieser Umgebung war erfolgreich (ohne Tests).

Wenn du möchtest
- Ich kann es erneut versuchen, den Gradle-Zip herunterzuladen (benötigt Netzwerkzugang). Du kannst mir kurz bestätigen, ob ich es erneut versuchen soll.
- Oder du führst lokal `gradle wrapper` aus (am schnellsten). Sag mir, wenn du willst, dass ich zusätzlich noch Beispielbefehle hinzufüge oder die README erweitere.

