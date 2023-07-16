# Schleifen

Schleifen sind eine grundlegende Steuerungsstruktur in der Programmierung. Sie erlauben es, dass ein bestimmter Codeblock wiederholt wird, bis eine bestimmte Bedingung erfüllt ist. In Java gibt es drei Haupttypen von Schleifen: `for`, `while` und `do-while`.

## For-Schleife

Die `for`-Schleife wird in der Regel verwendet, wenn die genaue Anzahl der Durchläufe im Voraus bekannt ist, z.B. wenn Sie über ein Array oder eine Collection iterieren möchten. Die Syntax sieht folgendermaßen aus:

```java
for (Initialisierung; Bedingung; Inkrement) {
    // Anweisungen
}
```

Beispiel:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Entschuldigung für die Verwirrung. Ja, du hast recht. Ich hätte die erweiterte `for`-Schleife, auch bekannt als "for-each" Schleife, in meinem vorherigen Post erwähnen sollen. Diese ist sehr nützlich, wenn man über eine Sammlung oder ein Array iterieren möchte.

## For-Each-Schleife

Die For-Each-Schleife (auch bekannt als erweiterte `for`-Schleife) ist besonders nützlich, wenn man über eine Sammlung oder ein Array iterieren möchte, ohne den Index zu benötigen. Die Syntax sieht folgendermaßen aus:

```java
for (Typ element : sammlung) {
    // Anweisungen
}
```

Ein Beispiel für die Anwendung dieser Schleife wäre folgendes:

```java
ArrayList<String> fruechte = new ArrayList<String>();
fruechte.add("Apfel");
fruechte.add("Birne");
fruechte.add("Kirsche");

for (String frucht : fruechte) {
    System.out.println(frucht);
}
```

In diesem Beispiel wird über die Liste `fruechte` iteriert und jede Frucht wird ausgegeben. Die For-Each-Schleife kümmert sich dabei um die Indizierung und beendet die Schleife, wenn alle Elemente durchlaufen wurden. Dies macht den Code sauberer und leichter lesbar, besonders wenn der Index des Elements in der Sammlung irrelevant ist.

**Wann For-Each-Schleife nutzen?**

Die For-Each-Schleife wird vor allem dann genutzt, wenn man über alle Elemente einer Sammlung oder eines Arrays iterieren möchte und der Index der Elemente dabei keine Rolle spielt. Sie ist weniger geeignet, wenn man bestimmte Elemente überspringen oder den Durchlauf in Abhängigkeit von bestimmten Bedingungen vorzeitig beenden möchte, da sie immer alle Elemente durchläuft. Auch wenn man den Index benötigt (etwa zum gleichzeitigen Durchlaufen zweier Listen), ist sie nicht die beste Wahl.


## While-Schleife

Die `while`-Schleife wird verwendet, wenn die Anzahl der Durchläufe im Voraus nicht bekannt ist und die Schleife ausgeführt werden soll, solange eine bestimmte Bedingung wahr ist.

```java
while (Bedingung) {
    // Anweisungen
}
```

Beispiel:

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

## Do-While-Schleife

Die `do-while`-Schleife ähnelt der `while`-Schleife, führt jedoch die Anweisungen mindestens einmal aus, bevor die Bedingung überprüft wird.

```java
do {
    // Anweisungen
} while (Bedingung);
```

Beispiel:

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```

## Wann welche Schleife nutzen?

- `for`: Wenn die Anzahl der Durchläufe im Voraus bekannt ist oder wenn Sie über eine Collection oder ein Array iterieren möchten.
- `while`: Wenn die Anzahl der Durchläufe im Voraus nicht bekannt ist und die Bedingung vor der Ausführung des Schleifenkörpers überprüft werden soll.
- `do-while`: Wenn die Anzahl der Durchläufe im Voraus nicht bekannt ist und der Schleifenkörper mindestens einmal ausgeführt werden soll, bevor die Bedingung überprüft wird.

# Funktionen in Java

## Was sind Funktionen?

Funktionen, in Java oft als Methoden bezeichnet, sind Blöcke von Anweisungen, die gemeinsam eine bestimmte Aufgabe ausführen. Die Hauptvorteile der Verwendung von Funktionen sind die Wiederverwendbarkeit von Code und die Verbesserung der Lesbarkeit und Organisiertheit des Programms.

Die Syntax für eine Funktion in Java ist folgende:

```java
Rückgabetyp Funktionsname(Parameterliste){
    // Anweisungen
    return Wert;
}
```

- **Rückgabetyp**: Der Datentyp des Wertes, den die Funktion zurückgibt. Wenn die Funktion nichts zurückgibt, wird das Schlüsselwort `void` verwendet.
- **Funktionsname**: Der Name, unter dem die Funktion aufgerufen wird.
- **Parameterliste**: Eine Liste von Parametern, die der Funktion übergeben werden. Jeder Parameter besteht aus einem Datentyp und einem Namen.

Ein einfaches Beispiel für eine Funktion könnte so aussehen:

```java
int summe(int a, int b) {
    int ergebnis = a + b;
    return ergebnis;
}
```

## Aufrufen von Funktionen

Eine Funktion wird aufgerufen, indem ihr Name zusammen mit den erforderlichen Parametern in Klammern angegeben wird. Wenn die Funktion einen Wert zurückgibt, kann dieser in einer Variablen gespeichert werden. Hier ist ein Beispiel, wie die oben definierte Funktion `summe` aufgerufen werden könnte:

```java
int summeDreierZahlen = summe(1, 2) + 3;
System.out.println(summeDreierZahlen); // Ausgabe: 6
```

## Funktionen und Best Practices

Beim Schreiben von Funktionen in Java sollten einige Best Practices beachtet werden:

- **Einzelverantwortung**: Jede Funktion sollte nur eine Aufgabe erfüllen. Dies macht den Code leichter zu verstehen und zu warten.
- **Klare Benennung**: Der Name einer Funktion sollte klar und aussagekräftig sein und beschreiben, was die Funktion tut.
- **Begrenzte Parameteranzahl**: Eine Funktion sollte möglichst wenige Parameter haben. Viele Parameter können den Code schwer lesbar machen und zu Fehlern führen.
- **Rückgabewerte nutzen**: Wenn eine Funktion einen Wert berechnen und diesen an den Aufrufer zurückgeben soll, sollte sie diesen Wert direkt zurückgeben und nicht über eine Ausgabe auf der Konsole oder eine Änderung des Zustands einer globalen Variable.