# Erzeugung und Nutzung von Zufallszahlen in Java

Java bietet verschiedene Möglichkeiten zur Erzeugung von Zufallszahlen. Die am häufigsten verwendeten Klassen sind `java.util.Random` und `java.util.concurrent.ThreadLocalRandom`. 

## java.util.Random

[API Dokumentation](https://docs.oracle.com/en/java/javase/20/docs/api/index.html)

Die `Random`-Klasse ist eine Instanzklasse und kann für verschiedene Arten von zufälligen Daten verwendet werden, wie z.B. Integer, Double, Long, Float usw.

Um Zufallszahlen zu erzeugen, muss eine Instanz der `Random`-Klasse erstellt werden und dann die entsprechende Methode aufgerufen werden.

Ein einfacher Code zum Generieren einer zufälligen Ganzzahl könnte so aussehen:

```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(100);  // erzeugt eine Zufallszahl zwischen 0 (inklusive) und 100 (exklusive)

        System.out.println("Zufallszahl: " + number);
    }
}
```


## Nutzung von Zufallszahlen

Zufallszahlen werden in vielen Bereichen der Informatik eingesetzt, zum Beispiel bei der Simulation von Ereignissen in Wissenschaft und Technik, bei Computerspielen und bei kryptographischen Anwendungen. 

Ein gutes Beispiel ist ein simples Würfelspiel. Mit der `Random`-Klasse können wir eine Zufallszahl zwischen 1 und 6 generieren, die einen Würfelwurf simuliert.

```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int diceRoll = rand.nextInt(6) + 1;  // erzeugt eine Zufallszahl zwischen 1 (inklusive) und 6 (inklusive)

        System.out.println("Du hast eine " + diceRoll + " gewürfelt!");
    }
}
```

## Challenge 1: Coin Flip
Löse die Challenge in der Datei `Challenges/Coinflip.java`.

# Arbeiten mit Arrays in Java

Arrays in Java sind containerartige Objekte, die eine feste Anzahl von Werten des gleichen Typs enthalten können. Der Typ kann ein primitiver Datentyp wie `int`, `char` oder `double` sein, oder es können Objekte sein, wie Instanzen von Klassen, `String`-Objekte oder Arrays von Objekten. 

## Klassische Arrays

Ein klassisches Array in Java wird mit der folgenden Syntax deklariert:

```java
Datentyp[] Arrayname;
```
Ein Beispiel für ein Array von `int`-Werten:

```java
int[] meinArray;
```

Das Array muss dann initialisiert werden, entweder durch Angabe der Größe des Arrays:

```java
meinArray = new int[5];  // Erstellt ein Array von 5 Integern
```

Oder durch direkte Zuweisung von Werten:

```java
meinArray = new int[] {1, 2, 3, 4, 5};  // Erstellt ein Array mit den Werten 1, 2, 3, 4 und 5
```

### Hinzufügen und Entfernen von Elementen

Da klassische Arrays eine feste Größe haben, können nach der Erstellung keine Elemente hinzugefügt oder entfernt werden. Sie können jedoch geändert werden, indem Sie den Index des zu ändernden Elements verwenden:

```java
meinArray[0] = 10;  // Ändert das erste Element des Arrays in 10
```

<img src="./arrays_01.gif" alt="Array-Index" style="zoom:75%;" />

### Arrays von Strings

Es ist möglich, dass wir eine Liste in einem String übergeben bekommen und diese Daten in einem Array bereitstellen müssen. Dazu können wir die `split()`-Methode verwenden, die einen String anhand eines Trennzeichens in ein Array von Strings aufteilt.

```java
String liste = "1,2,3,4,5";
String[] array = liste.split(",");
```
### Weitere wichtige Methoden für Arrays

- `length`: Gibt die Anzahl der Elemente im Array zurück
- `clone()`: Erstellt eine Kopie des Arrays
- `toString()`: Gibt eine String-Repräsentation des Arrays zurück
- `equals()`: Vergleicht zwei Arrays auf Gleichheit
- `sort()`: Sortiert die Elemente des Arrays

## Challenge 2: Pay Roulette
Löse die Challenge in der Datei `Challenges/PayRoulette.java`.

## ArrayLists

Im Gegensatz zu klassischen Arrays sind ArrayLists dynamische Datenstrukturen, das bedeutet, dass Elemente nach der Erstellung hinzugefügt und entfernt werden können.

Eine `ArrayList` wird wie folgt deklariert:

```java
import java.util.ArrayList;

// ...

ArrayList<Datentyp> liste = new ArrayList<>();
```



### Hinzufügen von Elementen

<img src="./waiting_line.png" alt="ArrayList" style="zoom:75%;" />
Wie im Coffee Shop, werden neue Elemente (Kunden) am Ende der Liste hinzugefügt.

```java
liste.add("Müder Student");  // Fügt 1 am Ende der Liste hinzu
```


Muss ein Element an einer bestimmten stelle eingefügt werden, werden kann dies durch mitgeben des Indexes geschehen. Alle Elemente ab dem Index werden um eine Position nach hinten verschoben.
```java
ArrayList<String> liste = new ArrayList<>();
liste.add(0, "Wichtige Geschäftsführerin");  // Fügt 2 an Index 0 hinzu, verschiebt andere Elemente
```



<aside class="warning" style="background-color: #FDB813F9; color: #ffffff; padding-left: 10px; display: flex; align-items: center;">
  <div style="flex-shrink: 0; margin-right: 10px; font-size: 24px;">&#9888;</div>
  <div style="background-color: rgba(255, 255, 255, 0.20); padding: 10px; flex-grow: 1;">Bei vielen Einschiebungen oder Löschungen aus der Mitte ist eine ArrayList ineffektiv. Hier kann eine LinkedList sinvoller sein.</div>
</aside>

### Entfernen von Elementen

Elemente können mit der `remove()`-Methode entfernt werden:

```java
liste.remove(0);  // Entfernt das Element an Index 0
liste.remove("Müder Student");  // Entfernt das erste Element mit dem Wert "Müder Student"
```

### Ausgabe von Elementen

Die Elemente einer ArrayList können mit `.get()` ausgegeben werden:

```java
System.out.println(liste.get(0));  // Gibt das Element an Index 0 aus
```

### Austauschen von Elementen

Ein Element kann mit der `set()`-Methode ausgetauscht werden:

```java
liste.set(0, "Wichtige Geschäftsführerin");  // Tauscht das Element an Index 0 mit "Wichtige Geschäftsführerin" aus
```

### Verschachtelte ArrayLists in Java

In Java ist es möglich, eine ArrayList in einer anderen ArrayList zu speichern. Dies wird oft als "verschachtelte ArrayList" bezeichnet. Verschachtelte ArrayLists können nützlich sein, wenn Sie Daten in einer tabellenartigen Struktur speichern möchten, z.B. eine Liste von Listen.

#### Erstellung einer verschachtelten ArrayList

Hier ist ein einfaches Beispiel für das Erstellen einer verschachtelten ArrayList:

```java
ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

ArrayList<Integer> innerList1 = new ArrayList<>();
innerList1.add(1);
innerList1.add(2);
innerList1.add(3);

ArrayList<Integer> innerList2 = new ArrayList<>();
innerList2.add(4);
innerList2.add(5);
innerList2.add(6);

outerList.add(innerList1);
outerList.add(innerList2);
```

In diesem Beispiel haben wir eine äußere ArrayList namens `outerList` erstellt, die ArrayLists von Integers speichert. Dann haben wir zwei innere ArrayLists, `innerList1` und `innerList2`, erstellt und diese zur `outerList` hinzugefügt.

#### Zugriff auf Elemente in einer verschachtelten ArrayList

Sie können auf die Elemente in der verschachtelten ArrayList zugreifen, indem Sie den Index des äußeren und inneren Elements angeben. Hier ist ein Beispiel:

```java
int firstElementOfFirstList = outerList.get(0).get(0);  // Dies gibt den ersten Eintrag von `innerList1` zurück
int thirdElementOfSecondList = outerList.get(1).get(2);  // Dies gibt den dritten Eintrag von `innerList2` zurück
```

In diesem Beispiel verwendet `outerList.get(0)` die `get`-Methode der ArrayList, um die erste innere Liste zu erhalten. Dann ruft `.get(0)` die `get`-Methode dieser inneren Liste auf, um das erste Element dieser Liste zu erhalten.

Ähnlich greifen wir auf das dritte Element der zweiten Liste zu, indem wir `outerList.get(1).get(2)` verwenden.

Verschachtelte ArrayLists können eine sehr effektive Möglichkeit sein, mehrdimensionale Daten in Java zu speichern und zu organisieren. Aber denken Sie daran, dass der Zugriff auf Elemente in verschachtelten ArrayLists mehrere `get`-Aufrufe erfordert, und Sie müssen sicherstellen, dass jeder dieser Aufrufe ein gültiges Element zurückgibt, um `IndexOutOfBoundsException` zu vermeiden.

### Weitere nützliche Methoden

- `size()`: Gibt die Anzahl der Elemente in der Liste zurück
- `clear()`: Entfernt alle Elemente aus der Liste
- `isEmpty()`: Gibt `true` zurück, wenn die Liste leer ist, sonst `false`
- `contains()`: Gibt `true` zurück, wenn die Liste das angegebene Element enthält, sonst `false`
- `indexOf()`: Gibt den Index des ersten Vorkommens des angegebenen Elements zurück, oder -1, wenn das Element nicht gefunden wurde

## Challenge 3: Baboon Figure
Löse die Challenge in der Datei `Challenges/BaboonFigure.java`.

## Challenge 4 - Abschlussprojekt: Rock Paper Scissors Lizard Spock
Löse die Challenge in der Datei `Challenges/RockPaperScissorsLizardSpock.java`.

# Streams

## Was ist ein Stream?

In Java repräsentiert ein Stream eine Sequenz von Elementen und unterstützt verschiedene Operationen zur Verarbeitung dieser Elemente. Streams sind speziell für den Gebrauch mit Lambda-Ausdrücken entworfen und bieten eine klare, funktionale Programmieransatz auf Kollektionen von Daten. 

Die Java Stream API kam mit Java 8, sie brachte eine deutliche Verbesserung im Hinblick auf die effiziente Verarbeitung von großen Datensätzen, insbesondere durch die Unterstützung von parallelen Operationen auf diesen Datensätzen.

Einige der Hauptvorteile von Java Stream sind:

- Keine Speicherveränderung: Streams verändern die zugrundeliegende Datenquelle nicht.
- Funktionale Programmierung: Streams unterstützen funktionale Programmiermethoden wie `filter`, `map`, `limit`, `reduce`, `find`, `match` und so weiter.
- Parallelismus: Ein Großteil der Stream-API ist für parallele Verarbeitung konzipiert und lässt uns leicht Leistungsgewinne auf Multiprozessorsystemen erzielen.

## Wichtige Operationen auf Streams

### Filtern

Mit der Methode `filter` können wir Elemente aus einem Stream anhand einer Bedingung herausfiltern. Das Filtern gibt einen neuen Stream zurück, der nur die Elemente enthält, die das Filterkriterium erfüllen.

```java
List<String> names = Arrays.asList("Anna", "Bob", "Charles", "David");
Stream<String> longNames = names.stream().filter(str -> str.length() > 4);
```

### Sortieren

Die `sorted` Methode sortiert die Elemente eines Streams in natürlicher Reihenfolge oder mithilfe eines benutzerdefinierten `Comparator`.

```java
// Natürliche Reihenfolge
List<Integer> numbers = Arrays.asList(1, 3, 2);
List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

// Mit eigenem Comparator
List<String> names = Arrays.asList("Anna", "Bob", "Charles", "David");
List<String> sortedNames = names.stream()
        .sorted((name1, name2) -> name1.length() - name2.length())
        .collect(Collectors.toList());
```
Die **Natural Order** (natürliche Ordnung) ist die Ordnung, die auf natürliche Weise von der Implementierung eines Objekttyps bereitgestellt wird. Für primitiven Datentypen und einige eingebaute Objekte in Java, wie z.B. `String`, `Integer`, `Double` etc., ist die natürliche Ordnung bereits definiert. Beispielsweise sortiert die natürliche Ordnung von `String` alphabetisch, während `Integer` numerisch sortiert.

Wenn Sie jedoch eine benutzerdefinierte Klasse haben, müssen Sie die natürliche Ordnung selbst festlegen. Dies kann durch das Implementieren des `Comparable` Interfaces und das Überschreiben der `compareTo` Methode erreicht werden. Die `compareTo` Methode gibt einen negativen, null oder positiven Wert zurück, je nachdem ob das aktuelle Objekt kleiner, gleich oder größer als das übergebene Objekt ist.

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
```

Nun können Sie eine Liste von `Person`-Objekten in natürlicher Ordnung sortieren:

```java
List<Person> people = Arrays.asList(new Person("Alice", 20), new Person("Bob", 30), new Person("Charlie", 25));
Collections.sort(people); // people is now sorted in natural order (by age)
```

Bitte beachten Sie, dass bei diesem Ansatz angenommen wird, dass 'jüngere' Personen 'kleiner' sind. Wenn Sie die Ordnung umkehren möchten (so dass 'ältere' Personen 'kleiner' sind), würden Sie `other.age - this.age` zurückgeben.


### Abbilden

Die `map` Funktion transformiert die Elemente eines Streams in eine andere Form. Zum Beispiel können wir eine Liste von Strings in eine Liste ihrer Längen umwandeln.

```java
List<String> words = Arrays.asList("hello", "world");
List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());
```

Diese Methoden sind nur einige der vielfältigen Operationen, die auf Streams angewendet werden können. Weitere sind beispielsweise `reduce` zur Aggregation von Stream-Elementen, `limit` zur Begrenzung der Anzahl von Elementen im Stream oder `match` zum Testen, ob bestimmte Bedingungen erfüllt sind. Streams bieten ein mächtiges Werkzeug, um mit Daten in Java zu arbeiten und sollten ein fester Bestandteil in der Toolbox eines jeden Java-Entwicklers sein.


## Anwendung von Arrays

Arrays finden Anwendung in zahlreichen Bereichen der Programmierung. Sie dienen zur Speicherung mehrerer Werte eines bestimmten Typs und ermöglichen es, mit diesen Werten in einer Schleife oder über Indizes zu arbeiten. Sie sind eine der grundlegenden Datenstrukturen und finden sich in nahezu jedem Bereich der Softwareentwicklung, von einfachen Aufgaben bis hin zu komplexen Algorithmen und Datenverarbeitungsaufgaben.

## Weitere Collections
In Java gibt es neben der `ArrayList` weitere Klassen, die zur Java Collections Framework gehören und verwendet werden können, um dynamische Arrays zu implementieren. Hier sind einige Alternativen:

1. **LinkedList**: Eine `LinkedList` ist eine Liste von Elementen, bei der jedes Element einen Verweis auf das nächste und vorherige Element hat. `LinkedList` ist nützlich, wenn Sie häufig Elemente in der Mitte der Liste hinzufügen oder entfernen möchten, da diese Operationen effizienter sind als in einer `ArrayList`.

    ```java
    import java.util.LinkedList;

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Element 1");
    linkedList.add("Element 2");
    linkedList.remove("Element 1");
    ```

2. **Vector**: Die `Vector` Klasse ist ähnlich zur `ArrayList`, aber sie ist synchronisiert, d.h. sie ist thread-sicher. Diese Eigenschaft kann nützlich sein, wenn Sie in einer multithreaded Umgebung arbeiten.

    ```java
    import java.util.Vector;

    Vector<String> vector = new Vector<>();
    vector.add("Element 1");
    vector.add("Element 2");
    vector.remove("Element 1");
    ```

3. **Stack**: Eine `Stack` repräsentiert einen LIFO (last in, first out) Stapel von Objekten. Man kann Objekte (genannt "Items") oben auf den Stapel legen (mit der `push`-Methode) und sie wieder herunternehmen (mit der `pop`-Methode).

    ```java
    import java.util.Stack;

    Stack<String> stack = new Stack<>();
    stack.push("Element 1");
    stack.push("Element 2");
    String topElement = stack.pop();  // topElement ist jetzt "Element 2"
    ```

4. **Deque (Double Ended Queue)**: Eine Deque unterstützt das Hinzufügen und Entfernen von Elementen an beiden Enden. Die `ArrayDeque`-Klasse ist eine wahrscheinlich effiziente Implementierung.

    ```java
    import java.util.ArrayDeque;

    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.addFirst("Element 1");
    deque.addLast("Element 2");
    String firstElement = deque.removeFirst();  // firstElement ist jetzt "Element 1"
    ```

Beachten Sie, dass jede dieser Alternativen ihre eigenen Vor- und Nachteile hat und die Wahl der geeigneten Datenstruktur von den spezifischen Anforderungen Ihres Programms abhängt.
