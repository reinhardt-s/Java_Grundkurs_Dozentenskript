# Kapitel 1 - Einführung

## Was mach Java so besonders?
Java bietet eine Reihe von Merkmalen, die es von vielen anderen Programmiersprachen unterscheiden:

1. **Plattformunabhängigkeit**: Dank der Java Virtual Machine (JVM) ist Java-Code plattformunabhängig. Sie können ein Programm einmal schreiben und es auf jedem Gerät laufen lassen, das eine JVM hat. Dies steht im Gegensatz zu Sprachen wie C++ oder Go, deren Code speziell für eine bestimmte Plattform kompiliert werden muss.

2. **Objektorientierte Programmierung**: Java ist vollständig objektorientiert. Alles in Java ist ein Objekt, und es bietet umfangreiche Unterstützung für Konzepte wie Klassen und Objekte, Vererbung, Polymorphie und Kapselung.

3. **Robustheit und Sicherheit**: Java hat eine starke Typisierung und führt zur Laufzeit umfangreiche Checks durch, was zu sichererem und zuverlässigerem Code führt. Darüber hinaus verhindert das Fehlen von Zeigern in Java eine ganze Klasse von potenziellen Problemen und Fehlern.

4. **Garbage Collection**: Java bietet eine automatische Speicherverwaltung, bekannt als Garbage Collection, die den Entwicklern die mühsame Aufgabe abnimmt, den Speicher manuell zu verwalten und freizugeben. Dies kann dazu beitragen, Speicherlecks und andere Speicherprobleme zu vermeiden.

5. **Umfangreiche Standardbibliothek**: Die Standardbibliothek von Java bietet eine riesige Menge an nützlichen Klassen und Methoden für Aufgaben von grundlegenden Datenstrukturen und Algorithmen bis hin zu Netzwerk- und Datenbankkommunikation.

6. **Multithreading**: Java bietet eingebaute Unterstützung für multithreaded Programmierung, was es einfacher macht, Programme zu erstellen, die mehrere Aufgaben gleichzeitig ausführen können.

7. **Große Entwicklergemeinschaft und Unternehmensunterstützung**: Java hat eine riesige globale Gemeinschaft von Entwicklern und wird von großen Unternehmen wie Google und Amazon weitgehend unterstützt. Es gibt eine Fülle von Ressourcen für das Lernen und die Problembehebung in Java, und viele Unternehmen verlassen sich für ihre wichtigsten Anwendungen auf Java.

8. **Reife und Stabilität**: Java existiert seit über zwei Jahrzehnten und hat sich in dieser Zeit als eine robuste, zuverlässige und leistungsfähige Sprache bewährt, die für alles von kleinen Webanwendungen bis hin zu großen Unternehmenssystemen eingesetzt wird.

Diese Merkmale machen Java zu einer attraktiven Wahl für viele verschiedene Arten von Softwareentwicklungsprojekten, von der Web- und Mobile App-Entwicklung bis hin zur Unternehmenssoftware und Big Data-Anwendungen.

## Was benötigen wir, um Java zu programmieren?
Um mit der Programmierung in Java zu beginnen, benötigen Sie einige grundlegende Tools und Ressourcen. Hier sind die wichtigsten:

1. **Java Development Kit (JDK)**: Das JDK ist die grundlegende Entwicklungsumgebung für das Schreiben von Java-Programmen. Es enthält den Java-Compiler (javac), die Java Virtual Machine (JVM), und andere Tools, die zum Kompilieren und Debuggen von Java-Code benötigt werden. Es gibt verschiedene Versionen des JDK von verschiedenen Anbietern. Oracle und OpenJDK sind zwei der populärsten.

2. **Integrierte Entwicklungsumgebung (IDE)**: Eine IDE ist ein Software-Tool, das das Schreiben, Kompilieren, Debuggen und Testen von Code erleichtert. Beliebte Java-IDEs sind IntelliJ IDEA, Eclipse und NetBeans. Diese bieten Features wie Code-Highlighting, Auto-Vervollständigung, Debugging-Tools, und mehr.

3. **Build-Tools und Abhängigkeitsmanager**: Tools wie Maven oder Gradle helfen beim Verwalten von Projektabhängigkeiten und beim Automatisieren des Build- und Deployment-Prozesses.

4. **Java Runtime Environment (JRE)**: Die JRE ist erforderlich, um Java-Anwendungen auszuführen. Sie enthält die JVM und die Java-Klassenbibliotheken. Beachten Sie jedoch, dass die JRE normalerweise als Teil des JDK installiert wird, so dass Sie sie nicht separat installieren müssen, wenn Sie das JDK installieren.

5. **Wissen über die Java-Syntax und die Kernbibliotheken**: Es ist natürlich wichtig, die Grundlagen der Java-Syntax und der Kernbibliotheken zu verstehen. Es gibt viele Online-Tutorials, Bücher und Kurse, die Ihnen helfen können, Java zu lernen.

6. **Ein Texteditor**: Obwohl eine IDE viele hilfreiche Funktionen bietet, benötigen Sie manchmal einen einfachen Texteditor für schnelle Änderungen oder zum Schreiben von kleinerem Code. Beispiele hierfür sind Notepad++, Sublime Text oder Visual Studio Code.

## Unser erstes Java-Programm
Um die Grundlagen der Java-Programmierung zu verstehen, werden wir ein einfaches Programm schreiben, das "Hello World" auf dem Bildschirm ausgibt. Dies ist ein klassisches Beispiel für ein erstes Programm, das in vielen Programmiersprachen geschrieben wird, um die Grundlagen zu erlernen.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
Dieser Code ist ein sehr einfaches Java-Programm, das den Text "Hello World!" auf dem Bildschirm ausgibt. Hier ist eine Zeile-für-Zeile Erklärung:

1. `public class HelloWorld {` : Dies definiert eine öffentliche Klasse namens "HelloWorld". In Java ist eine Klasse eine Vorlage für Objekte, und fast jeder Code ist Teil einer Klasse. Das Wort "public" ist ein Zugriffsmodifizierer, der angibt, dass diese Klasse von überall her zugänglich ist. Die geschweifte Klammer `{` markiert den Anfang des Klassenkörpers.

2. `public static void main(String[] args) {` : Dies definiert eine Methode namens "main". Diese spezielle Methode ist der Einstiegspunkt für das Java-Programm - wenn Sie das Programm ausführen, beginnt die JVM mit der Ausführung des Codes in der `main`-Methode. Die Worte "public" und "static" sind Zugriffsmodifizierer: "public" bedeutet, dass diese Methode von überall her zugänglich ist, und "static" bedeutet, dass diese Methode zur Klasse gehört und nicht zu Instanzen dieser Klasse. "void" bedeutet, dass diese Methode keinen Wert zurückgibt. `String[] args` ist ein Parameter, der ein Array von Strings repräsentiert - dies sind die Argumente, die von der Kommandozeile an das Programm übergeben werden können.

3. `System.out.println("Hello World!");` : Dies ist ein Aufruf der Methode `println` auf `System.out`, die für die Standardausgabe (in der Regel die Konsole) steht. Der Text "Hello World!" wird als Argument an die Methode übergeben und auf dem Bildschirm ausgegeben.

4. `}` : Dies schließt die `main`-Methode und die "HelloWorld"-Klasse. In Java markieren geschweifte Klammern den Anfang und das Ende von Blöcken von Code, wie Klassen und Methoden.

## Das Programm starten
Um dieses Programm auszuführen, müssen Sie es zuerst kompilieren. Dies bedeutet, dass der Java-Compiler den Quellcode in Bytecode übersetzt, der von der JVM ausgeführt werden kann. Der Java-Compiler ist Teil des JDK, so dass Sie ihn installieren müssen, bevor Sie fortfahren können.
```bash
javac HelloWorld.java
```

Wenn Sie das JDK installiert haben, sollte dies eine Datei namens "HelloWorld.class" erstellen. Dies ist die kompilierte Version des Programms, die von der JVM ausgeführt werden kann. Um das Programm auszuführen, verwenden Sie den `java`-Befehl:
```bash
java HelloWorld
```

