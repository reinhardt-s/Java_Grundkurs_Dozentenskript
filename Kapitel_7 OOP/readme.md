# Kapitel 7: Objektorientierte Programmierung in Java

Objektorientierte Programmierung (OOP) ist ein Programmierparadigma, das auf dem Konzept der "Objekte" basiert, die Datenstrukturen und Methoden enthalten. In Java ist alles, mit Ausnahme von primitiven Datentypen, ein Objekt.

## Die vier Säulen der OOP

### 1. Verkapselung (Encapsulation)

Verkapselung ist das Einschließen von Daten und den dazu gehörenden Funktionen in einer einzelnen Einheit, nämlich einer Klasse. Durch Verkapselung können wir den Zugriff auf die Daten kontrollieren und sie vor unerwarteter Manipulation schützen. In Java erreichen wir die Verkapselung durch den Gebrauch von Modifikatoren (private, public und protected) und durch Getter- und Setter-Methoden.

### 2. Vererbung (Inheritance)

Vererbung ist ein Merkmal, das es uns ermöglicht, eine neue Klasse zu definieren, die bereits definierte Methoden und Attribute einer bestehenden Klasse erbt. Dies ermöglicht Wiederverwendung von Code, fördert die Modularität und führt zu einer hierarchischen Klassifizierung. 

### 3. Polymorphie (Polymorphism)

Polymorphie erlaubt es uns, eine Methode auf unterschiedliche Weise zu verwenden. Es gibt zwei Arten von Polymorphie in Java: Compile-Zeit-Polymorphie (oder Überladung) und Laufzeit-Polymorphie (oder Überschreiben). 

### 4. Abstraktion (Abstraction)

Abstraktion verbirgt die Komplexität der Implementierungsdetails und zeigt nur die Funktionalität dem Benutzer. In Java können wir Abstraktion mit Hilfe von abstrakten Klassen und Interfaces erreichen.

## Klassen und Objekte

In Java ist eine Klasse eine Vorlage oder ein Bauplan für die Erstellung von Objekten. Ein Objekt ist eine Instanz einer Klasse, und es kann mehrere Instanzen derselben Klasse geben.

```java
public class Auto {
    // Attribute
    private String marke;
    private String farbe;

    // Methoden
    public void fahren() {
        System.out.println("Das Auto fährt.");
    }

    // Getter und Setter...
}
```

Um ein Objekt der Klasse `Auto` zu erstellen, würden wir folgenden Code verwenden:

```java
Auto meinAuto = new Auto();
```

Das Schlüsselwort `new` wird in Java verwendet, um ein neues Objekt zu erzeugen.

## Konstruktoren

Ein Konstruktor in Java ist ein spezieller Methodentyp, der beim Erstellen eines Objekts aufgerufen wird. Es hat den gleichen Namen wie die Klasse und hat keinen Rückgabetyp.

```java
public class Auto {
    private String marke;

    // Konstruktor
    public Auto(String marke) {
        this.marke = marke;
    }

    // Methoden, Getter und Setter...
}
```

Um ein neues Auto-Objekt mit einer bestimmten Marke zu erstellen, könnten wir jetzt folgenden Code verwenden:

```java
Auto meinAuto = new Auto("Mercedes");
```

## Instanzmethoden und -attribute

Instanzmethoden und -attribute sind Methoden und Attribute, die zu einem spezifischen Objekt einer Klasse gehören. Jedes Objekt hat seine eigenen Kopien dieser Variablen und Methoden.

## Statische Methoden und Attribute

Statische Methoden und Attribute gehören zur Klasse selbst und nicht zu den Instanzen der Klasse. Sie können aufgerufen oder verwendet werden, ohne dass eine Instanz der Klasse erstellt wird. Statische Methoden und Attribute werden mit dem Schlüsselwort `static` definiert.


# Generische Klassen in Java

Generische Klassen sind eine Kernfunktionalität in Java, die es uns ermöglicht, eine einzelne Klasse, Methode oder Schnittstelle zu schreiben, die für verschiedene Datentypen arbeiten kann. Sie verbessern die Typensicherheit und die Wiederverwendbarkeit des Codes.

Eine generische Klasse in Java ist definiert ähnlich wie eine normale Klasse, mit der Ausnahme, dass sie einen oder mehrere Typparameter hat. Diese Parameter, die durch spitze Klammern ("<" und ">") angegeben werden, können für verschiedene Datentypen stehen.

## Syntax:

Hier ist ein einfacher Beispielcode, um eine generische Klasse zu erstellen:

```java
public class GenericClass<T> {
    // T steht für "Type"
    private T t;

    public void setValue(T t) {
        this.t = t;
    }

    public T getValue() {
        return t;
    }
}
```
In diesem Beispiel repräsentiert `T` den Typ, der zur Laufzeit bereitgestellt wird. Sie können es als Platzhalter für den tatsächlichen Typ betrachten, der zur Erzeugung eines Objekts der Klasse `GenericClass` verwendet wird.

## Verwendung:

Ein Objekt einer generischen Klasse kann wie folgt erzeugt werden:

```java
GenericClass<Integer> intObj = new GenericClass<Integer>();
intObj.setValue(10);

GenericClass<String> strObj = new GenericClass<String>();
strObj.setValue("Hello World");
```
Hier haben wir zwei verschiedene Typen, Integer und String, verwendet, um die generische Klasse zu instanziieren. Wir können dann auf die Methoden der Klasse zugreifen, die für diese spezifischen Typen arbeiten.

Generische Klassen bieten viele Vorteile, einschließlich Typensicherheit (Vermeidung von ClassCastException zur Laufzeit), Code-Wiederverwendung und Leistungsoptimierung für die Java Virtual Machine (JVM).