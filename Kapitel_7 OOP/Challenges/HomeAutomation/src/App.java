// Schreibe ein Interface SelfCleaningInterface (SelfCleaningInterface.java), welches folgende Methoden deklariert:
// > startCleaning
//   Diese Methode startet den Selbstreinigungsprozess des Endgerätes.
//   Der Vorgang kann von Gerät zu Gerät variieren.
// > checkIfDirty
//   Diese Methode prüft, ob ein Gerät gereinigt werden muss.
//   Gibt True aus, falls das Gerät gereinigt werden muss. Andernfalls False.
// 
// Erstelle eine Klasse Dishwasher, welches SelfCleaningInterface implementiert:
// > checkIfDirty gibt True aus, wenn runCycles > 10 ist
// > startCleaning - gibt per print() aus, dass gereinigt wird und setzt anschließen runCycles auf null (0).
// > Initialisiere run_cycles im Konstruktor mit 0.
// 
// Erstelle eine Klasse CoffeeMaker, welches SelfCleaningInterface implementiert:
// > checkIfDirty gibt True per Zufall aus
// > startCleaning - gibt per print() aus, dass gereinigt wird und setzt anschließen runCycles auf null (0).
// 
// Lege in App.java je einen Dishwasher als auch einen CoffeeMaker an.
// Setze den runCyclesCount für den Dishwasher auf 15.
// Prüfe beide Geräte, ob sie gereinigt werden müssen und starte ggf. den Reinigungsprozess.

public class App {
    public static void main(String[] args) throws Exception {
        Dishwasher dishwasher = new Dishwasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        dishwasher.setRunCycles(15);

        if (dishwasher.checkIfDirty()) {
            dishwasher.startCleaning();
        }

        if (coffeeMaker.checkIfDirty()) {
            coffeeMaker.startCleaning();
        }
    }
}
