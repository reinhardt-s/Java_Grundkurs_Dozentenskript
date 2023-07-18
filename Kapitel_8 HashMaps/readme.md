# Hashmaps in Java

Eine HashMap ist eine Datenstruktur in Java, die verwendet wird, um Schlüssel-Wert-Paare zu speichern. Sie basiert auf dem Konzept der Hashtabellen und ermöglicht den schnellen Zugriff auf die gespeicherten Werte anhand des zugehörigen Schlüssels. In diesem Kapitel werden wir uns eingehend mit Hashmaps in Java befassen und ihre Verwendung verstehen.

## Einführung in Hashmaps

Eine HashMap ist Teil der Java Collections Frameworks und implementiert die `Map`-Schnittstelle. Sie ermöglicht die Speicherung von Schlüssel-Wert-Paaren, wobei jeder Schlüssel eindeutig ist. Das bedeutet, dass jede Kombination von Schlüssel und Wert in der HashMap einzigartig ist.

Im Hintergrund verwendet eine HashMap eine Hashtabelle, um die Schlüssel-Wert-Paare effizient zu speichern und abzurufen. Eine Hashtabelle ist eine Datenstruktur, die einen schnellen Zugriff auf Elemente ermöglicht, indem sie den Schlüssel in einen Hashcode umwandelt und diesen verwendet, um den Speicherort des Elements in der Tabelle zu bestimmen.

## HashMap erstellen

Um eine HashMap in Java zu erstellen, müssen wir die `HashMap`-Klasse importieren und eine Instanz davon erstellen. Hier ist ein Beispiel:

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap erstellen
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Schlüssel-Wert-Paare hinzufügen
        hashMap.put("Apfel", 3);
        hashMap.put("Banane", 5);
        hashMap.put("Orange", 2);

        // HashMap anzeigen
        System.out.println(hashMap);
    }
}
```

In diesem Beispiel erstellen wir eine HashMap, die Schlüssel vom Typ `String` und Werte vom Typ `Integer` enthält. Wir fügen dann Schlüssel-Wert-Paare mit der `put()`-Methode hinzu und geben schließlich die HashMap aus.

## Schlüssel-Wert-Paare hinzufügen und abrufen

Eine HashMap ermöglicht das Hinzufügen von Schlüssel-Wert-Paaren mithilfe der `put()`-Methode. Hier ist ein Beispiel:

```java
HashMap<String, Integer> hashMap = new HashMap<>();

// Schlüssel-Wert-Paare hinzufügen
hashMap.put("Apfel", 3);
hashMap.put("Banane", 5);
hashMap.put("Orange", 2);
```

Um den Wert für einen bestimmten Schlüssel abzurufen, verwenden wir die `get()`-Methode. Hier ist ein Beispiel:

```java
int anzahlAepfel = hashMap.get("Apfel");
System.out.println("Anzahl Äpfel: " + anzahlAepfel);
```

In diesem Beispiel rufen wir den Wert für den Schlüssel "Apfel" ab und speichern ihn in der Variable `anzahlAepfel`. Dann geben wir den Wert auf der Konsole aus.

## Iteration über eine HashMap

Um über eine HashMap zu iterieren, können wir entweder die `keySet()`-Methode verwenden, um alle Schlüssel abzurufen, oder die `entrySet()`-Methode, um Schlüssel-Wert-Paare abzurufen. Hier sind Beispiele für beide Ansätze:

```java
// Iteration über Schlüssel
for (String schlüssel : hashMap.keySet()) {
    int wert = hashMap.get(schlüssel);
    System.out.println(schlüssel + ": " + wert);
}

// Iteration über Schlüssel-Wert-Paare
for (HashMap.Entry<String, Integer> eintrag : hashMap.entrySet()) {
    String schlüssel = eintrag.getKey();
    int wert = eintrag.getValue();
    System.out.println(schlüssel + ": " + wert);
}
```

In beiden Schleifen verwenden wir die `keySet()`-Methode bzw. die `entrySet()`-Methode, um die entsprechenden Mengen von Schlüsseln bzw. Schlüssel-Wert-Paaren zu erhalten. Dann können wir über diese Mengen iterieren und die Schlüssel und Werte abrufen.

## HashMap-Größe und Überprüfung auf das Vorhandensein von Schlüsseln

Um die Größe einer HashMap abzurufen, verwenden wir die `size()`-Methode. Hier ist ein Beispiel:

```java
int größe = hashMap.size();
System.out.println("Größe der HashMap: " + größe);
```

Um zu überprüfen, ob ein bestimmter Schlüssel in der HashMap vorhanden ist, verwenden wir die `containsKey()`-Methode. Hier ist ein Beispiel:

```java
if (hashMap.containsKey("Apfel")) {
    System.out.println("Der Schlüssel 'Apfel' existiert in der HashMap.");
} else {
    System.out.println("Der Schlüssel 'Apfel' existiert nicht in der HashMap.");
}
```

In diesem Beispiel überprüfen wir, ob der Schlüssel "Apfel" in der HashMap vorhanden ist, und geben entsprechend eine Nachricht aus.

## HashMap-Elemente entfernen

Um ein bestimmtes Element anhand des Schlüssels aus einer HashMap zu entfernen, verwenden wir die `remove()`-Methode. Hier ist ein Beispiel:

```java
hashMap.remove("Apfel");
```

In diesem Beispiel entfernen wir das Element mit dem Schlüssel "Apfel" aus der HashMap.