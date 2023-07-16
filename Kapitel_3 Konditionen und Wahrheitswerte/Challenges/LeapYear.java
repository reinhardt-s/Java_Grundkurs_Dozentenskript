// Schreibe ein Programm welches prüft, ob ein Jahr ein Schaltjahr ist
// Die gregorianische Schalttagsregelung besteht aus folgenden drei einzelnen Regeln:
// 1. Die durch 4 ganzzahlig teilbaren Jahre sind, abgesehen von den folgenden Ausnahmen, Schaltjahre.
// 2. Säkularjahre, also die Jahre, die ein Jahrhundert abschließen (z. B. 1800, 1900, 2100 und 2200),
//    sind, abgesehen von der folgenden Ausnahme, keine Schaltjahre.
// 3. Die durch 400 ganzzahlig teilbaren Säkularjahre, zum Beispiel das Jahr 2000, sind jedoch Schaltjahre.
// Quelle: https://de.wikipedia.org/wiki/Schaltjahr

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = false;

        // Dein Code kommt hier unter dieser Zeile
        if (year % 4 == 0) { // Ist ein Schaltjahr da durch 4 teilbar
            if (year % 100 == 0) { // Ist ein Säkularjahr, also doch kein Schaltjahr
                if (year % 400 ==0) { // Ist ein Säkularjahr, aber durch 400 teilbar, also doch ein Schaltjahr
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " ist ein Schaltjahr");
        } else {
            System.out.println(year + " ist kein Schaltjahr");
        }
    }
}
