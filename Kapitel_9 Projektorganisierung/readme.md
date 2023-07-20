# Kapitel 9: Projektorganisierung mit Maven und Gradle

Maven und Gradle sind zwei beliebte Werkzeuge für die Projektverwaltung in der Java-Welt. Beide dienen dazu, den Build-Prozess von Java-Projekten zu automatisieren und zu vereinfachen.

## Maven

Maven ist ein Open-Source-Projektverwaltungswerkzeug, das von Apache entwickelt wurde. Es basiert auf dem Konzept eines Projekts (POM), das beschreibt, wie Software gebaut wird und welche Abhängigkeiten sie hat.

Maven bietet folgende Hauptfunktionen:

- **Projektverwaltung:** Maven bietet Informationen über das Projekt, wie z.B. die verwendeten Abhängigkeiten, die verwendeten Plugins und die verwendeten Versionen.

- **Dependency Management:** Maven kann automatisch alle notwendigen Abhängigkeiten für ein Projekt herunterladen und einfügen.

- **Automatisierung des Build-Prozesses:** Maven kann den Build-Prozess automatisieren und dabei helfen, die notwendigen Schritte zur Kompilierung, Testen und Verpacken der Anwendung durchzuführen.

Ein typisches Maven-Projekt hat eine `pom.xml` Datei an der Wurzel, die alle notwendigen Informationen über das Projekt und seine Abhängigkeiten enthält.

### `pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>de.pccollege</groupId>
  <artifactId>my-app</artifactId>
  <version>1.0-SNAPSHOT</version>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  
  <dependencies>
    <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.13</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
      </plugin>
    </plugins>
  </build>

</project>
```

In diesem Maven `pom.xml` Datei:
- Das Projekt hat eine Gruppen-ID von `com.example`, einen Artefakt-ID von `my-app`, und eine Version von `1.0-SNAPSHOT`.
- Die Quell- und Zielversion des Java-Compilers ist auf 1.8 gesetzt.
- Es gibt eine Abhängigkeit zu `junit` für Testzwecke.
- Das `maven-compiler-plugin` ist für den Build-Prozess konfiguriert.

### Eine Jar-Datei mit Maven erstellen
Um eine JAR-Datei aus einem Maven-Projekt in Visual Studio Code zu erstellen, benötigen Sie das Maven Plugin für Visual Studio Code. Das Plugin stellt eine Reihe von Befehlen bereit, die das Arbeiten mit Maven-Projekten erleichtern. 

Die Erstellung einer JAR-Datei kann in zwei Schritten erfolgen:

1. **Erstellen Sie eine POM-Datei**:
   In einem Maven-Projekt steuert die POM (Project Object Model)-Datei den Build-Prozess. Sie benötigen eine `pom.xml`-Datei, die den Befehl zum Erzeugen einer JAR-Datei enthält.

   Im `build`-Abschnitt Ihrer `pom.xml`-Datei sollten Sie ein Plugin hinzufügen, um eine ausführbare JAR-Datei zu erstellen. Ein Beispiel für ein solches Plugin könnte folgendermaßen aussehen:

    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.2.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.yourpackage.YourMainClass</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
    ```

   Achten Sie darauf, `com.yourpackage.YourMainClass` durch den vollständigen Namen Ihrer Hauptklasse zu ersetzen.

2. **Erzeugen Sie die JAR-Datei**:

    Für den folgenden Schritt muss mvn (maven) installiert sein: [Maven installieren](https://maven.apache.org/install.html)

   Nun können Sie die JAR-Datei erzeugen. Öffnen Sie das Terminal in Visual Studio Code (über `View > Terminal`), navigieren Sie zum Projektverzeichnis und führen Sie den folgenden Befehl aus:

   ```bash
   mvn clean package
   ```

   Dieser Befehl führt zunächst den `clean`-Befehl aus, um sicherzustellen, dass alle vorherigen Builds entfernt werden. Danach wird der `package`-Befehl ausgeführt, um die JAR-Datei zu erzeugen.

Die erstellte JAR-Datei finden Sie dann im `target`-Verzeichnis Ihres Projekts.

### Starten einer JAR-Datei
Um eine JAR-Datei zu starten, benötigen Sie die Java Runtime Environment (JRE) auf Ihrem Computer. Wenn Sie Java Development Kit (JDK) installiert haben, ist JRE bereits Teil davon.

Um die JAR-Datei zu starten, öffnen Sie ein Terminal (oder Eingabeaufforderung unter Windows) und navigieren Sie zum Verzeichnis, in dem sich die JAR-Datei befindet. Führen Sie dann den folgenden Befehl aus:

```bash
java -jar yourfile.jar
```

Ersetzen Sie `yourfile.jar` durch den Namen Ihrer JAR-Datei. Wenn Ihre JAR-Datei beispielsweise `app.jar` heißt, wäre der Befehl:

```bash
java -jar app.jar
```

Dieser Befehl startet die JAR-Datei mit der in Ihrer Java-Umgebung installierten JRE.

Wichtig zu beachten ist, dass die JAR-Datei eine ausführbare JAR-Datei sein muss, d.h., sie muss eine `MANIFEST.MF`-Datei enthalten, die die `Main-Class`-Eigenschaft festlegt, um die Hauptklasse Ihrer Anwendung zu spezifizieren. Diese `Main-Class` ist der Einstiegspunkt Ihrer Anwendung, wenn die JAR-Datei ausgeführt wird.

## Gradle

Gradle ist ein weiteres Open-Source-Projektverwaltungswerkzeug, das als Alternative zu Maven entwickelt wurde. Es verwendet eine Groovy-basierte domänenspezifische Sprache (DSL) anstelle des XML-basierten Projektobjektmodells (POM) von Maven. 

Gradle bietet ähnliche Funktionen wie Maven, einschließlich Projektmanagement, Abhängigkeitsmanagement und Automatisierung des Build-Prozesses, aber es hat einige zusätzliche Vorteile:

- **Flexibilität:** Gradle ist in der Lage, Projekte zu verwalten, die in verschiedenen Sprachen wie Java, C++, Python und mehr geschrieben sind.

- **Performance:** Gradle verwendet eine inkrementelle Build-Technologie, die es ermöglicht, nur die Teile des Projekts neu zu erstellen, die seit dem letzten Build geändert wurden. Dies führt zu einer erheblichen Beschleunigung des Build-Prozesses.

- **Anpassungsfähigkeit:** Gradle kann auf verschiedene Weisen konfiguriert und angepasst werden, um den spezifischen Anforderungen eines Projekts gerecht zu werden.

In einem typischen Gradle-Projekt gibt es eine `build.gradle` Datei an der Wurzel, die die Konfigurationsdetails des Projekts enthält.


### `build.gradle`

```groovy
plugins {
    id 'java'∏
}

group 'de.pccollege'
version '1.0-SNAPSHOT'

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.apache.httpcomponents:httpclient:4.5.13',
    testImplementation 'junit:junit:4.12'
}

test {
    useJUnitPlatform()
}
```

In dieser Gradle `build.gradle` Datei:
- Das `java` Plugin ist aktiviert.
- Die Gruppe und die Version des Projekts sind auf 'com.example' und '1.0-SNAPSHOT' eingestellt.
- Die Quellkompatibilität ist auf Java 1.8 festgelegt.
- `mavenCentral()` ist als Repository für Abhängigkeiten konfiguriert.
- Es gibt eine Abhängigkeit zu `junit` für Testzwecke.
- Die `useJUnitPlatform()` Methode wird aufgerufen, um JUnit für Tests zu verwenden.

### gradle-wrapper.properties
Die `gradle-wrapper.properties`-Datei ist eine Schlüssel-/Werte-Eigenschaftsdatei, die von Gradle verwendet wird, wenn es durch den Gradle Wrapper gestartet wird.

Die Hauptaufgabe des Gradle Wrappers besteht darin, sicherzustellen, dass Entwickler und CI-Server immer mit der exakt gleichen Gradle-Version arbeiten. Dies erhöht die Zuverlässigkeit und Konsistenz des Builds.

Die Datei `gradle-wrapper.properties` ist normalerweise im Verzeichnis `gradle/wrapper` innerhalb Ihres Projekts zu finden und enthält Informationen wie:

- `distributionUrl`: Der Download-Link für die spezifische Version von Gradle, die das Projekt verwenden soll. Dies ist normalerweise eine URL zu einem `.zip` oder `.all.zip` Archiv auf dem Gradle-Distributions-Server. Die URL endet mit der spezifischen Gradle-Version, die das Projekt verwenden soll, z.B. `https\://services.gradle.org/distributions/gradle-6.5-bin.zip`.
- `distributionBase`: Das Basisverzeichnis für den Download der Gradle-Distribution. Es ist normalerweise auf `GRADLE_USER_HOME` gesetzt.
- `distributionPath`: Der relative Pfad von `distributionBase`, wo die Gradle-Distribution heruntergeladen werden soll.
- `zipStoreBase`: Das Basisverzeichnis für den Speicherort des heruntergeladenen Gradle-Distributions-Archivs.
- `zipStorePath`: Der relative Pfad von `zipStoreBase`, wo das Gradle-Distributions-Archiv gespeichert werden soll.

Diese Datei sollte in Ihr Versionskontrollsystem eingecheckt werden, damit alle Entwickler und der CI-Server dieselbe Version von Gradle verwenden können, um Ihr Projekt zu bauen.


#### Gradle Wrapper aktualisieren
Um den Gradle Wrapper zu aktualisieren, müssen Sie die `distributionUrl` in der `gradle-wrapper.properties`-Datei ändern. Ändern Sie die URL so, dass sie auf die gewünschte Gradle-Version verweist.

Die mögliche Versionen von Gradle finden Sie hier: [Gradle Versions](https://gradle.org/releases/)

Nachdem Sie die `distributionUrl` geändert haben, müssen Sie den Gradle Wrapper neu erstellen. Öffnen Sie dazu ein Terminal (oder Eingabeaufforderung unter Windows) und navigieren Sie zum Verzeichnis Ihres Projekts. Führen Sie dann den folgenden Befehl aus:

```bash
gradlew wrapper --gradle-version 8.2.1
```
Wobei die Versionsnummer angepasst wird.

### Eine Jar-Datei mit Gradle erstellen

````
gradlew build
````
# Nutzung von Maven Repository

[Maven Repository](https://mvnrepository.com/) ist eine umfassende Quelle für Java-Bibliotheken, die Sie in Ihr Projekt einbinden können. Es unterstützt mehrere Build-Tools, darunter Maven, Gradle, Ivy und SBT.

## Finden einer Bibliothek

Um eine Bibliothek zu finden, nutzen Sie das Suchfeld auf der Startseite. Geben Sie den Namen der Bibliothek oder Schlüsselworte ein und drücken Sie die Eingabetaste. In der Ergebnisliste finden Sie möglicherweise verschiedene Versionen der Bibliothek, sortiert nach Veröffentlichungsdatum.

## Einbinden einer Bibliothek

Um eine Bibliothek in Ihr Projekt zu integrieren, wählen Sie die gewünschte Version aus. Sie gelangen dann zu einer Seite mit Details zur Bibliothek. Dort finden Sie unter anderem die Dependency-Informationen für verschiedene Build-Tools.

Wenn Sie Maven verwenden, kopieren Sie den bereitgestellten Code aus dem Maven-Bereich und fügen Sie ihn in die `<dependencies>`-Sektion Ihrer `pom.xml`-Datei ein. Beispiel:

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.0</version>
</dependency>
```

Für Gradle-Nutzer gibt es einen entsprechenden Abschnitt. Der Code aus diesem Abschnitt kann in den `dependencies`-Block Ihrer `build.gradle`-Datei eingefügt werden. Beispiel:

```groovy
implementation 'com.fasterxml.jackson.core:jackson-databind:2.13.0'
```

Anschließend wird die ausgewählte Bibliothek beim nächsten Build-Prozess automatisch heruntergeladen und in Ihr Projekt eingebunden. 

Stellen Sie sicher, dass Sie die richtige Version für Ihre Anforderungen und Ihre Java-Version wählen. Manchmal ist es besser, eine ältere, stabile Version zu verwenden, anstatt die neueste, möglicherweise instabile Version. 

Beachten Sie auch, dass einige Bibliotheken andere Bibliotheken als Abhängigkeiten haben. Diese werden normalerweise automatisch mit heruntergeladen und eingebunden.


# Projekt Einbindung und Nutzung von Lombok

Lombok ist ein sehr nützliches Java-Framework, das es ermöglicht, Boilerplate-Code in Java-Projekten zu reduzieren, indem es während der Kompilierung Code generiert. Es stellt eine Reihe von Annotationen bereit, mit denen Sie Ihren Code sauberer und lesbarer machen können.

## Projekt Einbindung

Um Lombok in Ihr Projekt zu integrieren, müssen Sie es zuerst als Abhängigkeit hinzufügen.

Wenn Sie Maven verwenden, fügen Sie folgenden Code in Ihre `pom.xml` Datei ein:

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.20</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

Für Gradle fügen Sie folgenden Code in Ihre `build.gradle` Datei ein:

```groovy
dependencies {
    compileOnly 'org.projectlombok:lombok:1.18.20'
    annotationProcessor 'org.projectlombok:lombok:1.18.20'
}
```

##  Nutzung von Lombok

Nachdem Lombok in Ihr Projekt eingebunden wurde, können Sie seine Vorteile nutzen, indem Sie die bereitgestellten Annotationen verwenden. Hier sind einige Beispiele:

- `@Getter` und `@Setter`: Diese Annotationen erzeugen Getter- und Setter-Methoden für Ihre Felder.

```java
@Getter
@Setter
public class Book {
    private String title;
    private String author;
}
```

- `@ToString`: Diese Annotation erzeugt eine `toString()` Methode.

- `@EqualsAndHashCode`: Diese Annotation erzeugt `equals(Object other)` und `hashCode()` Methoden.

- `@Data`: Eine bequeme Kurzform, die `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode` und andere nützliche Annotationen in einer einzigen Annotation kombiniert.

```java
@Data
public class Book {
    private String title;
    private String author;
}
```

- `@NoArgsConstructor`, `@RequiredArgsConstructor` und `@AllArgsConstructor`: Diese Annotationen erzeugen Konstruktoren ohne Argumente, mit den erforderlichen Argumenten oder mit allen Argumenten.

Beachten Sie bitte, dass Lombok eine Build-Zeit-Abhängigkeit ist und zur Laufzeit nicht benötigt wird.

Schließlich müssen Sie sicherstellen, dass Ihr IDE Lombok-Plugin installiert hat (falls Sie eine verwenden), um die von Lombok generierten Methoden korrekt zu erkennen. Für IntelliJ IDEA können Sie das Plugin über `File > Settings > Plugins > Lombok Plugin` installieren. Für Eclipse gibt es ein ähnliches Plugin, das über den Eclipse Marketplace verfügbar ist.

# Eine eigene Dependency erstellen

In diesem Kapitel werden wir eine einfache Java-Bibliothek erstellen, die als JAR-Datei mit Maven verpackt wird. Wir werden dann zeigen, wie man diese JAR-Datei in einem anderen Maven-Projekt verwendet. Als Beispiel verwenden wir eine einfache Wrapper-Klasse für `System.out.println()`, die wir `Print` nennen und die eine Methode `toConsole()` hat.

## Erstellen der Java-Bibliothek

Erstellen Sie zunächst ein neues Maven-Projekt und fügen Sie eine Klasse namens `Print` hinzu:

```java
public class Print {
    public static void toConsole(String message) {
        System.out.println(message);
    }
}
```

## Konfigurieren der POM.xml

Um Ihre Anwendung als JAR-Datei zu verpacken, müssen Sie das Maven JAR Plugin in Ihrer `pom.xml` konfigurieren. Fügen Sie dazu folgenden Code in den `<build>` Abschnitt Ihrer `pom.xml` Datei ein:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.2.0</version>
            <configuration>
                <archive>
                    <manifest>
                        <addClasspath>true</addClasspath>
                        <classpathPrefix>lib/</classpathPrefix>
                        <mainClass>com.example.Print</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
</build>
```
Ersetzen Sie `com.example.Print` mit dem vollständig qualifizierten Namen Ihrer Hauptklasse.

## Erstellen der JAR-Datei

Navigieren Sie in der Befehlszeile zum Verzeichnis Ihres Maven-Projekts und führen Sie den Befehl `mvn package` aus. Maven kompiliert Ihr Projekt und verpackt es in eine JAR-Datei im `target` Verzeichnis Ihres Projekts.

## Verwendung der JAR-Datei in einem anderen Projekt

Um die erstellte JAR-Datei in einem anderen Maven-Projekt zu verwenden, müssen Sie sie zunächst in Ihrem lokalen Maven-Repository installieren. Dies kann mit dem Befehl `mvn install` erfolgen.

Sobald die JAR-Datei installiert ist, können Sie sie als Abhängigkeit in einem anderen Maven-Projekt hinzufügen. Fügen Sie dazu folgenden Code in den `<dependencies>` Abschnitt Ihrer `pom.xml` Datei ein:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>print-lib</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
Ersetzen Sie `com.example` und `print-lib` durch die entsprechenden Werte Ihrer Bibliothek.

Jetzt können Sie die `Print.toConsole()` Methode in Ihrem Projekt verwenden:

```java
import com.example.Print;

public class Main {
    public static void main(String[] args) {
        Print.toConsole("Hello, World!");
    }
}
```
In diesem Beispiel wurde `com.example.Print` durch den tatsächlichen Pfad Ihrer `Print` Klasse ersetzt.

Das war's! Sie haben nun erfolgreich eine JAR-Datei mit Maven erstellt und diese in einem anderen Projekt verwendet.