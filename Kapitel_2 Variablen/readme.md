# Variablen
 Variablen sind Platzhalter für Werte. Sie können Werte speichern und verändern.
 Eine Variable hat immer einen Datentyp. Dieser Datentyp bestimmt, welche Werte in der Variable gespeichert werden können.
 
## Datentypen


| Datentyp | Größe (in Bits) | Wertebereich | Beispielwert |
|----------|----------------|--------------|--------------|
| byte     | 8              | -128 bis 127 | 10           |
| short    | 16             | -32,768 bis 32,767 | 1000      |
| int      | 32             | -2,147,483,648 bis 2,147,483,647 | 20000       |
| long     | 64             | -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807 | 100000L      |
| float    | 32             | ca. ±1.4e-45 bis ±3.4e38, bis zu 7 Dezimalstellen | 3.14F       |
| double   | 64             | ca. ±4.9e-324 bis ±1.8e308, bis zu 16 Dezimalstellen | 3.141592653589793 |
| boolean  | -              | true oder false | true         |
| char     | 16             | Unicode-Zeichen, 0 bis 65,535 | 'A'          |

### Ganzzahlen - int
 Ganzzahlen sind Zahlen ohne Nachkommastellen. Sie werden in der Informatik auch als Integer bezeichnet.
 ```java
 int a = 5;
 int b = 10;
 ```

### Lange Ganzzahlen - long
 Lange Ganzzahlen sind Zahlen ohne Nachkommastellen. Sie werden in der Informatik auch als Long bezeichnet.
 ```java
 long a = 5;
 long b = 10;
 ```

### Kurze Ganzzahlen - short
 Kurze Ganzzahlen sind Zahlen ohne Nachkommastellen. Sie werden in der Informatik auch als Short bezeichnet.
 ```java
 short a = 5;
 short b = 10;
 ```

### Gleitkommazahlen - float
 Gleitkommazahlen sind Zahlen mit Nachkommastellen. Sie werden in der Informatik auch als Float bezeichnet.
 ```java
 float a = 5.5;
 float b = 10.5;
 ```

### Lange Gleitkommazahlen - double
    Lange Gleitkommazahlen sind Zahlen mit Nachkommastellen. Sie werden in der Informatik auch als Double bezeichnet.
    ```java
    double a = 5.5;
    double b = 10.5;
    ```

### Zeichenketten - String
    Zeichenketten sind eine Aneinanderreihung von Zeichen. Sie werden in der Informatik auch als String bezeichnet.

```java
String a = "Hallo";
String b = "Welt";
```

Im Gegensatz zu den anderen Datentypen, werden Zeichenketten mit doppelten Anführungszeichen definiert.
String ist kein primitiver Datentyp, sondern eine Klasse. Klassen kommen in der Regel mit Methoden, die auf ihnen aufgerufen werden können. Eine Methode ist eine Funktion, die auf einem Objekt aufgerufen wird.
Die wichtigsten Methoden für Strings sind:
- **length()**: Gibt die Länge des Strings zurück.
- **toUpperCase()**: Gibt den String in Großbuchstaben zurück.
- **toLowerCase()**: Gibt den String in Kleinbuchstaben zurück.
- **charAt()**: Gibt das Zeichen an der angegebenen Position zurück.
- **indexOf()**: Gibt die Position des angegebenen Zeichens zurück.
- **substring()**: Gibt einen Teil des Strings zurück.

```java
String a = "Hallo Welt";
System.out.println(a.length()); // 10
System.out.println(a.toUpperCase()); // HALLO WELT
System.out.println(a.toLowerCase()); // hallo welt
System.out.println(a.charAt(0)); // H
System.out.println(a.indexOf("W")); // 6
System.out.println(a.substring(0, 5)); // Hallo
```

### Zeichen - char
 Zeichen sind einzelne Zeichen. Sie werden in der Informatik auch als Char bezeichnet.

 ```java
 char a = 'a';
 char b = 'b';
 ```

### Wahrheitswerte - boolean
Wahrheitswerte sind Werte, die entweder wahr oder falsch sein können. Sie werden in der Informatik 
auch als Boolean bezeichnet.
    ```java
    boolean a = true;
    boolean b = false;
    ```

## Variablen benamen
 Variablen können beliebig benannt werden. Es gibt jedoch einige Regeln, die eingehalten werden müssen.
 - Variablen dürfen nur aus Buchstaben, Zahlen und Unterstrichen bestehen.
 - Variablen dürfen nicht mit einer Zahl beginnen.
 - Variablen dürfen keine Leerzeichen enthalten.
 - Variablen dürfen keine Sonderzeichen enthalten.
 - Variablen dürfen keine Schlüsselwörter enthalten.

Darüber hinaus, nutzt man in Java zur Erstellung von Variablen den **lowerCamelCase**. 
Das bedeutet, dass der Name der Variablen mit einem Kleinbuchstaben beginnt und jeder weitere Wortanfang 
mit einem Großbuchstaben geschrieben wird.
```java
int myVar = 5;
String parcelDeliveryService = "DHL";
```

## Variablen überschreiben
 Variablen können überschrieben werden. Das bedeutet, dass der Wert der Variablen verändert werden kann.
 ```java
 int a = 5;
 a = 10;
 ```

## Variablen ausgeben
 Variablen können mit der Methode **System.out.println()** ausgegeben werden.
 ```java
 int a = 5;
 System.out.println(a);
 ```

## Challenge 1 - Person
Löse die Challenge in der Datein `Challenges/Person.java`.


## Arithmetische Operatoren
Arithmetische Operatoren sind Rechenzeichen. Sie werden verwendet, um Werte zu verändern.
```java
int a = 5;
int b = 10;
int c = a + b; // c = 15
```


| Operator | Beschreibung     | Beispiel mit Zahlen | Ergebnis mit Zahlen | Beispiel mit Strings | Ergebnis mit Strings |
|----------|------------------|--------------------|---------------------|----------------------|----------------------|
| +        | Addition         | 10 + 5             | 15                  | "Hello" + "World"    | "HelloWorld"         |
| -        | Subtraktion      | 10 - 5             | 5                   | -                    | -                    |
| *        | Multiplikation   | 10 * 5             | 50                  | -                    | -                    |
| /        | Division         | 10 / 5             | 2                   | -                    | -                    |
| %        | Modulo (Rest)    | 10 % 3             | 1                   | -                    | -                    |
| ++       | Inkrementieren   | int a = 5;<br/>a++;    | a ist jetzt 6       | -                    | -                    |
| --       | Dekrementieren   | int a = 5;<br/>a--;     | a ist jetzt 4       | -                    | -                    |

### PEMDAS
PEMDAS ist eine Abkürzung für die Reihenfolge, in der arithmetische Operatoren in mathematischen Ausdrücken ausgewertet werden sollen. Es steht für Klammern, Exponenten, Multiplikation, Division, Addition und Subtraktion. Die Reihenfolge, in der diese Operationen ausgewertet werden, ist wichtig, da sie das Ergebnis des Ausdrucks beeinflusst.


## Zuweisungsoperatoren
Zuweisungsoperatoren werden verwendet, um Werte zu verändern und zu speichern.
```java
int a = 5;
a += 5; // a = 10
```

| Operator | Beschreibung     | Beispiel mit Zahlen | Ergebnis mit Zahlen |
|----------|------------------|--------------------|---------------------|
| =        | Zuweisen         | int a = 5;<br/>a = 10; | a ist jetzt 10      | 
| +=       | Addieren und Zuweisen | int a = 5;<br/>a += 5; | a ist jetzt 10      | 
| -=       | Subtrahieren und Zuweisen | int a = 5;<br/>a -= 5; | a ist jetzt 0       | 
| *=       | Multiplizieren und Zuweisen | int a = 5;<br/>a *= 5; | a ist jetzt 25      | 
| /=       | Dividieren und Zuweisen | int a = 5;<br/>a /= 5; | a ist jetzt 1       | 
| %=       | Modulo (Rest) und Zuweisen | int a = 5;<br/>a %= 5; | a ist jetzt 0       | 



## Eingabe über die Konsole
Um Werte über die Konsole einzulesen, wird die Klasse **Scanner** verwendet.
```java
import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        // Erstelle ein Scanner-Objekt
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Zeichenkette
        System.out.println("Bitte geben Sie eine Zeichenkette ein:");
        String inputString = scanner.nextLine();
        System.out.println("Eingegebene Zeichenkette: " + inputString);

        // Frage den Benutzer nach einer Ganzzahl
        System.out.println("Bitte geben Sie eine Ganzzahl ein:");
        int inputInt = scanner.nextInt();
        System.out.println("Eingegebene Zahl: " + inputInt);

        // Schließe den Scanner
        scanner.close();
    }
}

```

### Was ist eine Klasse und was ist ein Objekt?
- **Klasse**: Eine Klasse ist ein Blueprint oder eine Vorlage für das Erstellen von Objekten. Eine Klasse definiert die Eigenschaften und Verhaltensweisen, die die von ihr erstellten Objekte haben werden. Diese Eigenschaften werden als Felder oder Variablen definiert, und die Verhaltensweisen werden als Methoden definiert.

- **Objekt**: Ein Objekt ist eine Instanz einer Klasse. Es hat einen Zustand und ein Verhalten, die auf der Definition der Klasse basieren, von der es instanziiert wurde. Der Zustand eines Objekts wird durch die Werte seiner Felder bestimmt, und sein Verhalten wird durch die Ausführung seiner Methoden definiert.

|   | Klasse | Objekt |
|---|--------|--------|
| Was ist es? | Ein Blueprint oder eine Vorlage | Eine Instanz einer Klasse |
| Definiert | Eigenschaften und Verhaltensweisen | Hat einen Zustand und ein Verhalten |
| Beispiele | Klasse Auto kann definieren, dass jedes Auto eine Farbe und eine Marke hat und fahren kann | Ein spezifisches Auto-Objekt könnte rot sein, eine Marke von BMW haben und eine bestimmte Geschwindigkeit fahren |

Ein einfacher Weg, um dies zu veranschaulichen, ist, dass Sie eine Klasse als Cookie-Form und ein Objekt als das tatsächliche Cookie, das aus dieser Form herauskommt, betrachten können. Die Form definiert die Eigenschaften des Cookies (wie seine Größe und Form), und das tatsächliche Cookie ist eine Instanz dieser Form, die diese Eigenschaften besitzt.

Ein Objekt einer Instanz wir erzeugt, indem das Schlüsselwort **new** verwendet wird.
```java
// Erstelle ein Objekt der Klasse Person
Person person = new Person();
```

## Challenge 2 - Multiplication
Löse die Challenge in der Datein `Challenges/Multiplication.java`.

# Debugger
Der Debugger ist ein Tool, mit dem du deinen Code Schritt für Schritt ausführen kannst.
In VS Code kannst du den Debugger mit der Tastenkombination **F5** starten.


# Arrays
Ein Array in Java ist ein Containerobjekt, das eine feste Anzahl von Werten des gleichen Typs speichert. Der Länge eines Arrays ist festgelegt und kann nach seiner Erstellung nicht mehr geändert werden.

* Ein Array kann Werte jedes Datentyps speichern. Sie können ein Array von Ganzzahlen, ein Array von Zeichenketten, sogar ein Array von eigenen benutzerdefinierten Objekten erstellen.
* Die Elemente eines Arrays sind durch Indizes zugänglich, die bei 0 beginnen. Das bedeutet, das erste Element eines Arrays ist an der Position 0, das zweite Element ist an der Position 1 und so weiter.
* Sie können den Wert eines Elements in einem Array ändern, aber Sie können nicht die Länge des Arrays ändern, nachdem es erstellt wurde.

In Java sind Arrays statisch und ihre Größe ist bei der Initialisierung festgelegt, was bedeutet, dass Sie die Größe eines Arrays nach seiner Erstellung nicht ändern können.

## Erstellen eines Arrays
Ein Array mit fester Größe wird mit dem Schlüsselwort **new** erstellt.

## Auf einen Wert zugreifen
Der Zugriff auf einen Wert erfolgt über den Index des Wertes. Der Index  `[]` beginnt bei 0.

```java
// Erstelle ein Array mit 5 Ganzzahlen
int[] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 5;

System.out.println(numbers[0]); // 1
System.out.println(numbers[1]); // 2
System.out.println(numbers[2]); // 5
System.out.println(numbers[3]); // 0
System.out.println(numbers[4]); // 0
System.out.println(numbers[5]); // IndexOutOfBoundsException
```

# args
Die Variable **args** ist ein Array, das alle Argumente enthält, die beim Starten des Programms übergeben wurden.
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
```

## Scanner
Scanner ist eine Klasse in Java, die es ermöglicht, Eingaben von der Konsole zu lesen. Um Scanner zu verwenden, müssen Sie die Klasse importieren.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int number = scanner.nextInt();
        System.out.println("Die eingegebene Zahl ist: " + number);
    }
}
```

### Wichitge Methoden von Scanner
- **nextInt()**: Liest eine Ganzzahl von der Konsole ein.
- **nextDouble()**: Liest eine Gleitkommazahl von der Konsole ein.
- **nextLine()**: Liest eine Zeichenkette von der Konsole ein.
- **nextBoolean()**: Liest einen Wahrheitswert von der Konsole ein.

<aside class="warning" style="background-color: #FDB813F9; color: #ffffff; padding-left: 10px; display: flex; align-items: center;">
  <div style="flex-shrink: 0; margin-right: 10px; font-size: 24px;">&#9888;</div>
  <div style="background-color: rgba(255, 255, 255, 0.20); padding: 10px; flex-grow: 1;">Nachdem ein Zahlenwert eingelesen wurde, bleibt der Zeilenumbruch vom bestätigen der Eingabe zurück. aus `14` wird also `14\n`. Daher sollte vor dem Einlesen der nächsten `nextLine` ein weiteres `nextLine` aufgerufen werden, der den Zeilenumbruch abfängt.</div>
</aside>



## Challenge 3 - Multiplication Part 2
Schreibe deine Lösung von Challenge 2 so um, dass die Zahlen direkt beim Ausführen des Programms übergeben werden können.

## Challenge 4 - Leap Year
Löse die Challenge in der Datein `Challenges/LeapYear.java`. Nutze hierfür Modulo.

