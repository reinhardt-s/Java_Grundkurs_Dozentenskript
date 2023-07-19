# Kapitel 10: Grundlagen

## 10.1 Compiler

Der Compiler ist ein essentieller Bestandteil einer jeden Programmiersprache. In Java ist es der Java Compiler (`javac`), der den Quellcode (.java Dateien) in Bytecode (.class Dateien) übersetzt. Bytecode ist eine Zwischensprache, die von der Java Virtual Machine (JVM) interpretiert und ausgeführt wird.

Der Java-Compiler prüft den Code auf Syntaxfehler, Typenkonflikte und andere mögliche Probleme, bevor er den Bytecode erzeugt. Wenn der Compiler Fehler findet, gibt er diese aus und stoppt den Kompilierungsprozess.

### Funktion des Java Compilers

Der Java-Compiler, oft als `javac` bezeichnet (nach dem Befehl, der in der Befehlszeile ausgeführt wird, um ihn zu starten), durchläuft mehrere Phasen, wenn er den Quellcode kompiliert:

1. **Parsing**: Zuerst liest der Compiler den gesamten Java-Quellcode und zerlegt ihn in kleinere Teile, bekannt als Tokens. Diese Tokens repräsentieren die kleinsten Einheiten des Codes wie Schlüsselwörter, Bezeichner, Operatoren, Literal usw.

2. **Type Checking**: Der Compiler prüft dann, ob die Variablen und Methoden korrekt deklariert und verwendet wurden, basierend auf den Java-Sprachregeln und -Spezifikationen.

3. **Code Generation**: Schließlich erzeugt der Compiler den Bytecode und schreibt diesen in .class-Dateien.

### Fehlerüberprüfung

Ein wesentlicher Aspekt des Kompilierungsprozesses ist die Fehlerüberprüfung. Wenn im Quellcode Fehler vorhanden sind (wie Syntaxfehler, Typenfehler, etc.), wird der Compiler diese erkennen und eine Fehlermeldung ausgeben, die Informationen über die Art des Fehlers und seine Position im Code enthält. Der Kompilierungsprozess wird gestoppt, bis der Fehler behoben ist.

Dieser Prozess ist entscheidend für das Schreiben von korrektem und funktionierendem Code. Ohne den Compiler wären diese Fehler möglicherweise erst zur Laufzeit erkennbar, was zu unerwarteten Programmverhalten und schwer zu findenden Bugs führen könnte.

### Plattformunabhängigkeit

Ein einzigartiger Aspekt des Java-Compilers ist seine Plattformunabhängigkeit. Java-Bytecode ist plattformunabhängig und kann auf jeder Maschine ausgeführt werden, die eine Java Virtual Machine (JVM) hat. Dies bedeutet, dass Java-Code auf einer Plattform geschrieben, auf einer anderen kompiliert und auf einer völlig anderen ausgeführt werden kann, solange jede Maschine eine JVM hat. Dies ist einer der Hauptgründe für die weit verbreitete Verwendung von Java in der Softwareentwicklung.

## 10.2 Laufzeitumgebung

Die Java-Laufzeitumgebung (Java Runtime Environment, JRE) enthält die Software-Tools, die zum Ausführen von Java-Anwendungen benötigt werden. Dazu gehört die Java Virtual Machine (JVM) und die Java-Klassenbibliothek.

Die JVM ist für die Ausführung des Java-Bytecodes verantwortlich. Sie fungiert als Abstraktionsschicht zwischen dem ausführbaren Code und dem Betriebssystem und ermöglicht so die plattformunabhängige Ausführung von Java-Programmen.

Die Java-Klassenbibliothek besteht aus einer umfangreichen Sammlung von Klassen, die nützliche Funktionen für die Entwicklung von Java-Anwendungen bereitstellen.

### Komponenten der Java-Laufzeitumgebung

Die JRE besteht aus mehreren Komponenten, einschließlich:

1. **Java Virtual Machine (JVM)**: Die JVM ist das Herz der JRE und verantwortlich für die Ausführung des Java-Bytecodes. Sie ist eine abstrakte Rechenmaschine, die einen Befehlssatz bereitstellt und Speicherbereiche verwaltet, die während der Ausführung einer Java-Anwendung benötigt werden. Die JVM ist plattformabhängig, was bedeutet, dass ihre Implementierung von der spezifischen Hardware- und Betriebssystemplattform abhängt, auf der sie ausgeführt wird.

2. **Java-Klassenbibliotheken**: Dies sind vorgefertigte Java-Bibliotheken, die von Java-Anwendungen verwendet werden können. Sie enthalten zahlreiche Klassen und Methoden für Aufgaben wie Netzwerkkommunikation, Datei-I/O, Datenbankverbindung, Benutzeroberflächenentwicklung und vieles mehr.

3. **Java Class Loader**: Dies ist ein Teil der Java-Laufzeitumgebung, der zur Laufzeit Java .class-Dateien lädt und sie in die JVM verlinkt.

### Plattformunabhängigkeit

Wie bei Java allgemein, ist ein wichtiger Aspekt der JRE ihre Plattformunabhängigkeit. Java-Anwendungen sind in der Lage, auf jeder Plattform zu laufen, die eine JRE hat. Diese Plattformunabhängigkeit wird durch die JVM gewährleistet, die als Abstraktionsschicht zwischen dem Java-Bytecode und dem spezifischen Betriebssystem und der Hardware dient, auf dem die Anwendung läuft.

### Notwendigkeit der JRE

Die JRE ist für das Ausführen von Java-Anwendungen notwendig. Entwickler, die Java-Anwendungen erstellen, benötigen jedoch das Java Development Kit (JDK), das die JRE und zusätzliche Tools für die Entwicklung von Java-Anwendungen enthält, wie z.B. den Java-Compiler. Benutzer, die nur Java-Anwendungen ausführen müssen (ohne sie zu entwickeln), benötigen nur die JRE auf ihrem System.


## 10.3 Garbage Collection

Garbage Collection (GC) ist ein automatisierter Speicherbereinigungsmechanismus, der in Java zur Verfügung steht. Das Java-Programm erstellt während seiner Ausführung viele Objekte. Wenn diese Objekte nicht mehr benötigt werden, müssen sie gelöscht werden, um Speicherplatz freizugeben.

In vielen Programmiersprachen muss der Programmierer den Speicher manuell freigeben. In Java wird dies jedoch von der Garbage Collection automatisch gehandhabt. Der Garbage Collector findet Objekte, die nicht mehr zugänglich sind, und gibt deren Speicherplatz frei.

Die Garbage Collection trägt erheblich zur Sicherheit und Effizienz von Java-Programmen bei, da sie hilft, Speicherlecks und andere mit der Speicherverwaltung verbundene Fehler zu vermeiden. Jedoch kann eine GC, die zu oft auftritt oder zur falschen Zeit ausgeführt wird, die Leistung beeinträchtigen. Daher ist es wichtig, ein Verständnis dafür zu entwickeln, wie die Garbage Collection funktioniert und wie sie sich auf die Anwendungsleistung auswirkt.

### Funktion der Garbage Collection

Jedes Mal, wenn eine Anwendung in Java ein neues Objekt erstellt, reserviert die JVM (Java Virtual Machine) Speicher für dieses Objekt aus dem Heap. Im Laufe der Zeit kann der Heap-Speicher voll werden, und wenn mehr Speicher benötigt wird, als verfügbar ist, wird ein OutOfMemoryError ausgelöst.

Um dies zu verhindern, kommt der Garbage Collector ins Spiel. Wenn ein Objekt in Java nicht mehr erreicht oder verwendet werden kann, betrachtet der Garbage Collector es als "Abfall" und gibt den vom Objekt belegten Speicher frei. 

### Erreichbarkeit und Lebenszyklus von Objekten

Ein Objekt gilt als "erreichbar", wenn es direkt oder indirekt über Verweise von einem sogenannten "Root"-Objekt aus zugegriffen werden kann. Root-Objekte sind zum Beispiel aktive Threads oder statische Variablen. Wenn ein Objekt nicht erreichbar ist, ist es für die Garbage Collection geeignet.

Ein Objekt durchläuft mehrere Phasen in seinem Lebenszyklus: Erstellung, Nutzung und schließlich die Phase, in der es als "Abfall" betrachtet wird und vom Garbage Collector entfernt wird.

### GC Algorithmen

Es gibt mehrere Algorithmen für die Garbage Collection in Java, und verschiedene JVMs können verschiedene GCs verwenden. Einige der bekanntesten Algorithmen sind:

- Mark and Sweep: Dieser Algorithmus markiert zunächst alle erreichbaren Objekte und löscht dann alle nicht markierten Objekte.

- Copying: Dieser Algorithmus teilt den Heap in zwei Teile und kopiert alle erreichbaren Objekte von einem Teil in den anderen und löscht dann den ersten Teil vollständig.

- Generational GC: Dieser Algorithmus berücksichtigt, dass die meisten Objekte in einer Anwendung kurzlebig sind. Der Heap wird in zwei Bereiche unterteilt: den "Young Generation"- und den "Old Generation"-Bereich. Zuerst wird die Garbage Collection im Young Generation-Bereich durchgeführt, und nur überlebende Objekte werden schließlich in den Old Generation-Bereich verschoben.

### Beachten Sie

Obwohl die Garbage Collection hilfreich ist, um Speicher zu verwalten und Speicherlecks zu vermeiden, ist sie kein Allheilmittel. Entwickler sollten immer noch gute Praktiken für die Speicherverwaltung befolgen, wie das Freigeben von Ressourcen, wenn sie nicht mehr benötigt werden, und das Vermeiden von unnötigen Objekterstellungen.
