# Kapitel 7: Objektorientierte Programmierung (OOP) in Java

Die Objektorientierte Programmierung (OOP) ist ein Programmierparadigma, das auf dem Konzept von "Objekten" basiert, die Datenstrukturen enthalten und Verhalten (Methoden) aufweisen können. Diese Objekte sind Instanzen von Klassen, die Sie als Vorlage oder Bauplan für die Erstellung von Objekten betrachten können. Java ist vollständig objektorientiert, mit wenigen Ausnahmen in den primitiven Datentypen.

**Klassen**
Eine Klasse ist der Bauplan für ein Objekt, der die Attribute und Methoden definiert, die das Objekt haben wird. Ein Attribut ist eine Eigenschaft des Objekts, während eine Methode das Verhalten ist, das das Objekt durchführen kann. Klassen in Java werden mit dem Schlüsselwort `class` definiert.

```java
public class Auto {
    // Attribute
    String marke;
    String modell;
    int baujahr;

    // Methode
    void hupen() {
        System.out.println("Hup, hup!");
    }
}
```

**Objekte**
Ein Objekt ist eine Instanz einer Klasse. Sie können ein Objekt einer Klasse erstellen, indem Sie das Schlüsselwort `new` und den Klassennamen verwenden. Sie können dann auf die Attribute und Methoden des Objekts zugreifen.

```java
public static void main(String[] args) {
    Auto meinAuto = new Auto();  // Erzeugt ein neues Auto-Objekt
    meinAuto.marke = "BMW";  // Zugriff auf das Attribut
    meinAuto.hupen();  // Aufruf der Methode
}
```

**Vererbung**
In Java kann eine Klasse Eigenschaften und Methoden von einer anderen Klasse erben. Dies wird Vererbung genannt und erfolgt durch das Schlüsselwort `extends`.

```java
public class Sportwagen extends Auto {
    // Sportwagen erbt alle Attribute und Methoden von Auto
    boolean kabriolett;

    void rennen() {
        System.out.println("Schnell fahren!");
    }
}
```

**Polymorphie**
Polymorphie in Java ermöglicht es, dass eine Methode unterschiedliches Verhalten aufweist, abhängig vom Objekt, das sie aufruft. Sie können Polymorphie in Java durch Methodenüberschreiben (d.h., eine Methode in der Unterklasse hat den gleichen Namen wie eine Methode in der Superklasse) und Interfaces erreichen.

**Encapsulation**
Die Kapselung in Java ist ein Mechanismus zum Verbergen von Daten (Attribute) und Methoden innerhalb einer Klasse vor dem Zugriff von außen. In Java wird die Kapselung durch den Zugriffsmodifikator `private` erreicht, und Sie verwenden "Getter" und "Setter" Methoden, um auf die privaten Attribute zuzugreifen und diese zu ändern.

```java
public class Auto {
    private String marke;  // Private Attribute

    // Getter-Methode
    public String getMarke() {
        return marke;
    }

    // Setter-Methode
    public void setMarke(String marke) {
        this.marke = marke;
    }
}
```

**Abstraktion**
Die Abstraktion in Java ist der Prozess des Verbergens der Implementierungsdetails und des Zeigens nur der Funktionalität. Abstrakte Klassen und Interfaces unterstützen die Abstraktion in Java. Sie können keine Instanz einer abstrakten Klasse erstellen, und sie kann sowohl abstrakte (ohne Körper) als auch nicht-abstrakte Methoden enthalten.

```java
public abstract class Fahrzeug {
    public abstract void fahren();
}
```

## Vererbung (Inheritance)

In Java ermöglicht die Vererbung, dass eine Klasse Eigenschaften und Methoden von einer anderen Klasse erbt. Dies ist eine zentrale Säule des OOP-Prinzips, da es Code-Wiederverwendung fördert und die Komplexität von Software reduziert.

### Grundkonzepte

Die Klasse, die Eigenschaften und Methoden bereitstellt, wird als "Superklasse" oder "Basisklasse" bezeichnet, während die Klasse, die diese Eigenschaften und Methoden erbt, als "Unterklasse" oder "abgeleitete Klasse" bezeichnet wird.

In Java wird die Vererbung durch das Schlüsselwort `extends` erreicht.

```java
public class BaseClass {
    // Code der BaseClass
}

public class DerivedClass extends BaseClass {
    // Code der DerivedClass
}
```

In diesem Beispiel erbt `DerivedClass` alle zugänglichen Eigenschaften und Methoden von `BaseClass`.

### Zugriffsmodifikatoren und Vererbung

Nicht alle Eigenschaften und Methoden einer Basisklasse sind für eine abgeleitete Klasse sichtbar. Der Zugang hängt von den Zugriffsmodifikatoren ab:

- `private`: Die Eigenschaften oder Methoden sind nur innerhalb der Klasse sichtbar, in der sie definiert sind.
- `protected`: Die Eigenschaften oder Methoden sind innerhalb derselben Klasse, in einer abgeleiteten Klasse und im gleichen Paket sichtbar.
- Ohne Zugriffsmodifikator (Paket-privat): Die Eigenschaften oder Methoden sind innerhalb derselben Klasse und im gleichen Paket sichtbar.
- `public`: Die Eigenschaften oder Methoden sind überall sichtbar.

### Überschreiben von Methoden (Method Overriding)

Eine Unterklasse kann eine Methode der Superklasse "überschreiben", indem sie eine Methode mit derselben Signatur definiert. Dies ermöglicht der Unterklasse, das Verhalten der Superklasse zu ändern. Beim Überschreiben einer Methode ist es üblich, die Annotation `@Override` zu verwenden, um klarzustellen, dass die Methode in der Superklasse überschrieben wird.

```java
public class BaseClass {
    public void doSomething() {
        // Code...
    }
}

public class DerivedClass extends BaseClass {
    @Override
    public void doSomething() {
        // anderer Code...
    }
}
```

### Super Keyword

Das Schlüsselwort `super` in Java wird verwendet, um auf Eigenschaften und Methoden der unmittelbaren Superklasse zuzugreifen. Es ist besonders nützlich, wenn die Unterklasse Methoden der Superklasse überschreibt, aber dennoch auf das ursprüngliche Verhalten zugreifen möchte.

```java
public class BaseClass {
    public void doSomething() {
        // Code...
    }
}

public class DerivedClass extends BaseClass {
    @Override
    public void doSomething() {
        super.doSomething(); // ruft die Methode doSomething der Superklasse auf
        // zusätzlicher Code...
    }
}
```

### Abstrakte Klassen und Methoden

Abstrakte Klassen sind Klassen, die nicht instanziiert werden können und oft als Basisklassen dienen. Sie können abstrakte Methoden enthalten, die von jeder abgeleiteten Klasse implementiert werden müssen. Abstrakte Klassen und Methoden werden mit dem Schlüsselwort `abstract` definiert.

```java
public abstract class AbstractBaseClass {
    public abstract void doSomething();
}

public class DerivedClass extends AbstractBaseClass {
    @Override
    public void doSomething() {
        // implementiert die abstrakte Methode
    }
}
```

In diesem Beispiel muss `DerivedClass` die abstrakte Methode `doSomething` implementieren. Es wäre ein Kompilierungsfehler, wenn es dies nicht täte.

Vererbung ist ein mächtiges Konzept in OOP, das zur Erstellung flexibler und wiederverwendbarer Software beiträgt. Es erlaubt der Programmstruktur, hierarchisch und damit leichter zu verstehen und zu warten zu sein.