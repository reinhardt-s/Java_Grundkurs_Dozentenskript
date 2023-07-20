# Spring Boot

## Einführung

Spring Boot ist ein Framework, das auf dem Spring-Framework basiert. Es vereinfacht die Erstellung von stand-alone, produktionsreifen Spring-basierten Anwendungen. Spring Boot bietet eine "opinionierte" Ansicht des Spring-Frameworks, was bedeutet, dass es die Entscheidungen bezüglich der Framework-Konfiguration und der benötigten Abhängigkeiten für Sie trifft.

## Features

- **Automatische Konfiguration**: Spring Boot kann viele Spring-basierte Anwendungsteile automatisch konfigurieren.
  
- **Starters**: Einfache Abhängigkeitsbeschreibungen, die häufig zusammen genutzte Abhängigkeiten gruppieren, um den Build so einfach wie möglich zu gestalten.

- **Eingebetteter HTTP-Server**: Anwendungen werden in einem eingebetteten Tomcat-, Jetty- oder Undertow-Server ausgeführt. Sie benötigen keine WAR-Datei.

- **Sicherheit**: Spring Boot ermöglicht es, Anwendungen sicher zu machen. Es hat verschiedene Methoden zum Sichern Ihrer Anwendung.

- **Health Checks**: Spring Boot bietet automatische Prüfungen, um zu erkennen, ob eine Anwendung ordnungsgemäß läuft.

- **Externes YAML/Properties-Konfigurations**: Spring Boot lässt sich sehr leicht konfigurieren.

## Erstellen einer Spring Boot-Anwendung

Spring Initializr (start.spring.io) ist eine bequeme Möglichkeit, ein neues Spring Boot-Projekt zu starten. Sie können die benötigten Abhängigkeiten auswählen und ein Projekt zum Herunterladen generieren.

## Controller, Services und Repositories

Im Spring Framework und Spring Boot sind Controller, Services und Repositories wichtige Teile. Sie bilden die drei Schichten einer typischen Spring-Anwendung.

- **Controller**: Die Controller sind dafür verantwortlich, eingehende HTTP-Anfragen zu verarbeiten und eine passende HTTP-Antwort zurückzugeben. In Spring Boot werden Controller-Klassen normalerweise mit der `@RestController`-Annotation gekennzeichnet.

- **Services**: Services enthalten die Geschäftslogik der Anwendung. Sie werden normalerweise mit der `@Service`-Annotation gekennzeichnet.

- **Repositories**: Repositories sind die Schnittstelle zur Datenbank. Sie verwenden das Spring Data JPA-Framework, um CRUD-Operationen auf der Datenbank auszuführen. Sie werden normalerweise mit der `@Repository`-Annotation gekennzeichnet.

## Datenbankzugriff mit Spring Boot

Spring Boot bietet Unterstützung für viele Datenbanken und Datenzugriffstechnologien, einschließlich JPA, Hibernate, JDBC und vieles mehr. Sie können mit der Spring Data JPA-Bibliothek einfach CRUD-Operationen durchführen.

## Sicherheit in Spring Boot

Spring Boot integriert Spring Security, um die Sicherheit Ihrer Anwendung zu gewährleisten. Sie können HTTP-Sicherheit, Methodensicherheit und sogar OAuth2-Sicherheit konfigurieren.

## Testing in Spring Boot

Spring Boot bietet Unterstützung für verschiedene Arten von Tests, einschließlich Unit-Tests und Integrationstests. Mit dem Spring Boot Test-Modul können Sie einfach Tests schreiben und ausführen.

Insgesamt bietet Spring Boot eine umfangreiche Plattform für das Erstellen von Java-Anwendungen mit minimalem Aufwand und maximaler Flexibilität.

## Die application.properties

Die `application.properties` Datei ist eine sehr wichtige Datei in einer Spring Boot Anwendung. Sie wird verwendet, um verschiedene Arten von Konfigurationsparametern zu definieren, die von der Anwendung verwendet werden.

Spring Boot verwendet ein Eigenschaften-basiertes Konfigurationssystem, das es den Entwicklern ermöglicht, eine Reihe von Konfigurationswerten in einer Datei zu definieren, die dann in der gesamten Anwendung genutzt werden können. Dies bedeutet, dass die Konfiguration zentral verwaltet und geändert werden kann, ohne dass der Code selbst geändert werden muss.

Die `application.properties` Datei befindet sich standardmäßig im Verzeichnis `src/main/resources`, kann aber auch an anderen Stellen platziert werden, je nach den spezifischen Anforderungen und Präferenzen der Entwickler.

Die in der `application.properties` Datei definierten Werte können einfach mit der `@Value`-Annotation in jedem beliebigen Spring Bean injiziert werden.

Beispiel einer `application.properties` Datei:

```
server.port=8080
spring.datasource.url=jdbc:mysql://localhost/test
spring.datasource.username=root
spring.datasource.password=secret
```

In diesem Beispiel legen wir den Port des Servers fest, auf dem die Anwendung laufen soll, und geben die Details für die Verbindung zur Datenbank an. 

Die `application.properties` Datei ist flexibel und erlaubt die Definition jeglicher Art von Konfigurationswerten, die von der Anwendung benötigt werden. 

Es ist auch möglich, mehrere `application.properties` Dateien zu haben, die für verschiedene Umgebungen wie Entwicklung, Test und Produktion gedacht sind. Diese können mit Profilen in Spring Boot verwendet werden, um die korrekten Einstellungen für die jeweilige Umgebung auszuwählen.


# Erstellung eines REST-Services mit Spring Boot

Spring Boot macht es extrem einfach, einen RESTful-Webdienst zu erstellen. In diesem Kapitel werden wir eine einfache Anwendung erstellen, die eine einfache REST-API zur Verfügung stellt.

## Erstellung des Projekts

Zuerst erstellen Sie ein neues Spring Boot-Projekt. Sie können dies entweder manuell tun, oder Sie können [Spring Initializr](https://start.spring.io/) verwenden, um ein Grundgerüst für Ihr Projekt zu generieren. Stellen Sie sicher, dass Sie "Web" als Abhängigkeit für Ihr Projekt auswählen, da dies die Spring MVC-Bibliothek enthält, die wir für die Erstellung unserer REST-API verwenden werden.

## Erstellung des Controllers

Der nächste Schritt ist die Erstellung eines Controllers. Ein Controller ist eine Klasse, die die Anfragen an Ihre Webanwendung verarbeitet. Hier ist ein einfacher Controller, der eine Anfrage an den Endpunkt "/hello" verarbeitet:

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```

Die Annotation `@RestController` teilt Spring mit, dass diese Klasse als Controller verwendet werden soll. Die Methode `sayHello()` wird aufgerufen, wenn eine GET-Anfrage an den Endpunkt "/hello" gestellt wird. Die Annotation `@GetMapping("/hello")` definiert dies.

## Starten der Anwendung

Jetzt können Sie Ihre Anwendung starten. Wenn Sie Spring Initializr verwendet haben, um Ihr Projekt zu erstellen, sollten Sie bereits eine "main"-Methode in Ihrer Hauptklasse haben. Andernfalls fügen Sie folgenden Code in Ihre Hauptklasse ein:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

Nun starten Sie Ihre Anwendung, indem Sie die "main"-Methode ausführen. Ihre REST-API ist nun unter "http://localhost:8080/hello" erreichbar.

## Erweitern Ihrer API

Die oben gezeigte API ist sehr einfach. In einer realen Anwendung würden Sie wahrscheinlich Daten aus einer Datenbank oder einem anderen Service abrufen und diese Daten als JSON oder XML zurückgeben. Sie können dies tun, indem Sie ein Objekt aus Ihrer Methode zurückgeben. Spring konvertiert dieses Objekt automatisch in das entsprechende Format. Hier ist ein Beispiel:

```java
@GetMapping("/user")
public User getUser() {
    User user = new User();
    user.setName("John Doe");
    user.setEmail("john.doe@example.com");
    return user;
}
```

In diesem Beispiel würde die `getUser()`-Methode ein `User`-Objekt zurückgeben, das automatisch in JSON konvertiert wird.